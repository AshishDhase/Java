package com.project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

import com.aylien.textapi.responses.Sentiment;
import com.project.dao.ArticleDao;
import com.project.dao.ProductDao;
import com.project.model.Product;
import com.project.model.SentimentExtractor;

/**
 * Servlet implementation class GetProductController
 */
public class GetProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductDao productDao;   
    private ArticleDao articleDao;
    private SentimentExtractor sentimentExtractor;
    private String reviewArticle;
    
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			productDao = new ProductDao();
			articleDao = new ArticleDao();
			sentimentExtractor = new SentimentExtractor();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			// read the "command" parameter
			String command = request.getParameter("command");
			int theCommand = 0;
			
			// if the Command is missing then default is LIST PRODUCT
			if(command == null) {
				theCommand = 1;
				System.out.println("In if: "+theCommand);
			}else if(command.equals("ADD")) {
				theCommand = 2;
				System.out.println("In Else if: "+theCommand);
			}else if(command.equals("LOAD")) {
				theCommand = 3;
				System.out.println("In Else if LOAD 3: "+theCommand);
			}else if(command.equals("UPDATE")) {
				theCommand = 4;
				System.out.println("In Else if UPDATE 4: "+theCommand);
			}else if(command.equals("DELETE")) {
				theCommand = 5;
				System.out.println("In Else if DELETE 5: "+theCommand);
			}else if(command.equals("EXTRACT")) {
				theCommand = 6;
				System.out.println("In Else if EXTRACT 6: "+theCommand);
			}else if(command.equals("SENTIMENT")) {
				theCommand = 7;
				System.out.println("In Else if SENTIMENT 7: "+theCommand);
			}
			// route to appropriate method
			switch(theCommand) {
			
			case 1 :
				// list products in mvc fashion
				listProducts(request, response);
				System.out.println("Case 1 list :"+theCommand);
				break;
				
			case 2 :
				addProduct(request, response);
				System.out.println("Case 2 ADD : "+theCommand);
				break;
			
			case 3:
				loadProduct(request, response);
				System.out.println("Case 3 LOAD : "+theCommand);
				break;
				
			case 4:
				updateProduct(request, response);
				break;
				
			case 5:
				deleteProduct(request, response);
				break;
				
			case 6:
				fetchArticle(request, response);
				break;
				
			case 7:
				fetchSentiment(request,response);
				break;
				
			default:
				listProducts(request, response);
				
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
		
	}


	private void fetchSentiment(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		
		// Pass the article to the class Sentiment Extractor and get the result
		//Sentiment sentiment = sentimentExtractor.getSentiment(reviewArticle);
		//String result = sentiment.getPolarity();
		//System.out.println("result of polarity: "+result);
		// Place the result in request attribute
		//request.setAttribute("SENTIMENT_RESULT", result);
		String result = sentimentExtractor.getSentiment(reviewArticle);
		request.setAttribute("SENTIMENT_RESULT", result);
		// Get RequestDispatcher and forward it to sentiment-analysis-result.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("/sentiment-analysis-result.jsp");
		dispatcher.forward(request, response);
	}


	private void fetchArticle(HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		
		// read product id from data
		String theProductId = request.getParameter("productId");
		System.out.println(theProductId);
		
		// Get Review Article
		reviewArticle = articleDao.extractArticle(theProductId);
		
		// place Review Article in request attribute
		request.setAttribute("REVIEW_ARTICLE", reviewArticle);
		
		// Get RequestDispatcher and Forward it to show-review-article.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("/show-review-article.jsp");
		dispatcher.forward(request, response);
		
	}


	private void deleteProduct(HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		
		// read product id from  data
		String theProductId = request.getParameter("productId");
		
		// delete product from database
		productDao.deleteProduct(theProductId);
		
		// send them back to "list students" page
		listProducts(request, response);

		
	}


	private void updateProduct(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		System.out.println("In Update Product");
		// read student info from form data
		int id = Integer.parseInt(request.getParameter("productId"));
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		
		// create a new student object
		Product theProduct = new Product(id, name, url);
		
		// perform update on database
		productDao.updateProduct(theProduct);
		
		// send them back to the "list students" page
		listProducts(request, response);
		

	}


	private void loadProduct(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		
		// read Product id from form data
		String id = request.getParameter("productId");
		
		// get product from database (ProductDao)
		Product theProduct = productDao.getProduct(id);
		
		// place product in request attribute
		request.setAttribute("THE_PRODUCT", theProduct);
		
		// send to jsp page : update-product-form.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-product-form.jsp");
		dispatcher.forward(request, response);
	}


	private void addProduct(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// read product info from form data
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		// create new Product object
		Product product = new Product(name, url);
		
		// add the product in database
		productDao.addProduct(product);
		
		// send back to the main page (the product list)
		listProducts(request, response);
	}


	private void listProducts(HttpServletRequest request, HttpServletResponse response) 
	throws Exception{
		
		// get products from ProductDao
		List<Product> products = productDao.getProducts();
		
		// add Product to request
		request.setAttribute("PRODUCT_LIST", products);
		
		// Display products on jsp(view)
		RequestDispatcher dispatcher =  request.getRequestDispatcher("/showProduct.jsp");
		dispatcher.forward(request, response);
	}



}
