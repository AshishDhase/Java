<%-- <%@page import = "java.util.*, com.project.model.Product" %> --%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <meta name="description" content="Affordable and professional web design">
	  <meta name="keywords" content="web design, affordable web design, professional web design">
  	<meta name="author" content="Ashish Dhase">
    <title>Sentiment Analysis | Welcome</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="./css/style.css">
  </head>
  <body>
    <header>
      <div class="container">
        <div id="branding">
          <h1><span class="highlight">Sentiment</span> Analysis</h1>
        </div>
    </div>
    </header>

    <section id="showcase">
      <div class="container">
        <h1>Too Lazy to Read Long Review Articles?</h1>
        <p>Our system provides you the sentiment analysis of the articles in real time.</p>
      </div>
    </section>

    <section id="newsletter">
      <div class="container">
          
        <h1>List of the Products</h1>
        <form>
            <button type="button" class="button_1" onclick="window.location.href = 'add-product-form.jsp' ">
             Add New Product
            </button>
        </form>
      </div>
    </section>

    <section id="boxes">
      <div class="container">

      <table class="table">
          <thead>
            <tr>
              <th scope="col">Name</th>
              <th scope="col">Article URL</th>
              <th scope="col">Action</th>
            </tr>
          </thead>

          
        <c:forEach var="tempProduct" items="${PRODUCT_LIST}">
            <!-- set up a link for each Product -->
                <c:url var="tempLink" value="getProduct">
                    <c:param name="command" value="LOAD" />
                    <c:param name="productId" value="${tempProduct.id}" />
                </c:url>
                
            <!--  set up a link to delete a article -->
                <c:url var="deleteLink" value="getProduct">
                    <c:param name="command" value="DELETE" />
                    <c:param name="productId" value="${tempProduct.id}" />
                </c:url>

            <!--  set up a link to extract a article -->
                <c:url var="articleLink" value="getProduct">
                    <c:param name="command" value="EXTRACT" />
                    <c:param name="productId" value="${tempProduct.id}" />
                </c:url>
          <tbody>
            <tr>
              <!--<th scope="row">1</th> -->
              <td>${tempProduct.name}</td>
              <td>${tempProduct.url}</td>
              <td>
                  <a href="${tempLink}" class="btn btn-outline-secondary btn-sm">Update</a>
                  <a href="${deleteLink}"
                  onclick="if (!(confirm('Are you sure you want to delete this product?'))) return false" 
                  class="btn btn-outline-danger btn-sm">Delete</a>
                  <a href="${articleLink}" class="btn btn-outline-success btn-sm">Get Article from URL</a>
              </td>
            </tr>
        </c:forEach>
          </tbody>
        </table>
      </div>
    </section>

    <footer>
      <p>BE Project Sentiment Analysis</p>
    </footer>
  </body>
</html>
