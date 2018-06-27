package com.project.aylienweb;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArticleAnalyzer
 */
public class ArticleAnalyzer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticleAnalyzer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String URL = request.getParameter("URL");
		String article = new ArticleExtractor().getArticle(URL);
		String sentiment = null;
		try {
			sentiment = new SentimentDemo().getSentiment(article);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * This code was meant for testing purpose 
		 * It will generate output on separate html page
		// Step 1 : Set Content type
		response.setContentType("text/html");
		
		// Step 2 : get PrintWriter
		PrintWriter out = response.getWriter();
		// Step 3 : Generate HTML content
		out.println("Entered URL: "+ request.getParameter("URL"));
		out.println(sentiment);
		*/
		
		request.setAttribute("sentiment_output", sentiment);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		
		dispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
