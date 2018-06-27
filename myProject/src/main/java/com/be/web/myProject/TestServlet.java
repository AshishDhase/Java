package com.be.web.myProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Resource(name = "jdbc/web_url_tracker")
	private DataSource dataSource;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// step 1 : Get PrintWriter
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		// step 2 : Get a connection to DB
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
		// step 3 : Create a SQL statement
		myConn = dataSource.getConnection();
		String sql = "select * from product_url"; 
		
		
		// step 4 : Execute SQL Query
		myStmt = myConn.createStatement();
		
		// step 5 : Process the Result Set
		myRs = myStmt.executeQuery(sql);
		
		while(myRs.next()) {
			String product = myRs.getString("product_name");
			out.println(product);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	

}
