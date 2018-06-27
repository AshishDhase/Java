package com.project.dao;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.aylien.textapi.TextAPIClient;
import com.aylien.textapi.TextAPIException;
import com.aylien.textapi.parameters.ExtractParams;
import com.aylien.textapi.responses.Article;
import com.project.model.ArticleBase;


public class ArticleDao {
	private static final String USER_ID = "2b4d6582";
	private static final String USER_KEY = "04edc6728dac11565864f02fb93226ce";
	
	ArticleBase article;
	
	TextAPIClient client = new TextAPIClient(USER_ID, USER_KEY);
	ExtractParams.Builder builder = ExtractParams.newBuilder();
	java.net.URL url = null;
	String reviewUrl = null;
	String articleFromWeb;
	
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	public String extractArticle(String theProductId) throws Exception{
		
		try {
			
			int productId = Integer.parseInt(theProductId);
			System.out.println("Extract Article Product id: "+productId);
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_url_tracker", "root", "password");
			
			String sql = "select url from product_url where id=?";
			
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, productId);
			
			rs = stmt.executeQuery();
			
			// retrieve data from result set row
			if (rs.next()) {
				
				reviewUrl = rs.getString("url");
				System.out.println("In rs.next(): reviewUrl "+reviewUrl);
				
			}else {
					throw new Exception("Could not find product id: " + productId);
			}	
			System.out.println("Outside of rs.next(): reviewUrl "+reviewUrl);
			url = new java.net.URL(reviewUrl);
			articleFromWeb = articleBuilder(url);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(conn, stmt, rs);
		}

		return articleFromWeb;
		
	}

	private String articleBuilder(URL url) {
		// TODO Auto-generated method stub
		System.out.println("Outside of first try catch finally: reviewUrl "+reviewUrl);
	    builder.setUrl(url);
	    builder.setBestImage(false);
	    Article extract = null;
		try {
			extract = client.extract(builder.build());
		} catch (TextAPIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("In articleBuilder(url)");
	    System.out.println(extract.getTitle());
		return extract.getArticle();
		
	}

	private void close(Connection conn2, PreparedStatement stmt2, ResultSet rs2) {
		// TODO Auto-generated method stub
		try {
			
			if(rs2 != null) {
				rs.close();
			}
			
			if(stmt2 != null) {
				stmt.close();
			}
			
			if(conn2 != null) {
				conn.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
