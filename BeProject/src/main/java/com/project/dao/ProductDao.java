package com.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.model.Product;

public class ProductDao {
	
	public List<Product> getProducts() throws Exception{
	
		List<Product> products = new ArrayList<Product>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_url_tracker", "root", "password");
			String sql = "select * from product_url order by product_name";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			/*
			if(rs.next()) {
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("product_name"));
				product.setUrl(rs.getString("url"));
			}
			*/
			
			while(rs.next()) {
				
				// retrieve data from ResultSet row
				int id = rs.getInt("id");
				String name = rs.getString("product_name");
				String url = rs.getString("url");
				
				// Create a new Product object
				Product tempProduct = new Product(id, name, url);
				
				// add it to the list of Product
				products.add(tempProduct);
			}
			
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			close(conn, stmt, rs);
		}
		return products;
	}

	private void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			
			if(rs != null) {
				rs.close();
			}
			
			if(stmt != null) {
				stmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void addProduct(Product product) throws Exception{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			
			// get db connection
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_url_tracker", "root", "password");
			
			// create sql for insert
			String sql = "insert into product_url "
						+"(product_name, url) "
						+"values (?,?)";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, product.getName());
			stmt.setString(2, product.getUrl());
			
			// Execute sql insert
			stmt.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			// Clean up JDBC objects	
			close(conn, stmt, null);
		}
	
	}

	public Product getProduct(String id) throws Exception{
		
		Product theProduct = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int productId;
		
		try {
			
			// get db connection
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_url_tracker", "root", "password");
			
		
			// convert student id to int
			productId = Integer.parseInt(id);
				
	
				
			// create sql to get selected student
			String sql = "select * from product_url where id=?";
				
			// create prepared statement
			stmt = conn.prepareStatement(sql);
				
			// set params
			stmt.setInt(1, productId);
				
			// execute statement
			rs = stmt.executeQuery();
				
			// retrieve data from result set row
			if (rs.next()) {
				String name = rs.getString("product_name");
				String url = rs.getString("url");
				
					
				// use the studentId during construction
				theProduct = new Product(productId, name, url);
				}
				else {
					throw new Exception("Could not find product id: " + productId);
				}	
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			// Clean up JDBC objects	
			close(conn, stmt, rs);
		}
	
		

		return theProduct;
	}

	public void updateProduct(Product theProduct)  throws Exception{
		
		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_url_tracker", "root", "password");
			
			// create SQL update statement
			String sql = "update product_url "
						+ "set product_name=?, url=? "
						+ "where id=?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setString(1, theProduct.getName());
			myStmt.setString(2, theProduct.getUrl());
			
			myStmt.setInt(3, theProduct.getId());
			
			// execute SQL statement
			myStmt.execute();
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}

		
	}

	public void deleteProduct(String theProductId)
			throws Exception{
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		System.out.println("In delete Product");
		try {
			// convert student id to int
			int productId = Integer.parseInt(theProductId);
			
			// get connection to database
			Class.forName("com.mysql.jdbc.Driver");
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_url_tracker", "root", "password");
			
			// create sql to delete student
			String sql = "delete from product_url where id = ?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, productId);
			
			// execute sql statement
			int test = myStmt.executeUpdate();
			System.out.println("result: "+test);
		}
		finally {
			// clean up JDBC code
			close(myConn, myStmt, null);
		}	
	}

}

