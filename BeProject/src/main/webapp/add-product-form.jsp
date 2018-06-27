<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <meta name="description" content="Affordable and professional web design">
	  <meta name="keywords" content="web design, affordable web design, professional web design">
    <meta name="author" content="Ashish Dhase">
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <title>Add Product</title>
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

    <section id="newsletter">
      <div class="container">
        <h1>Add New Product</h1>
 
      </div>
    </section>

    <section id="main">
      <div class="container">
  
      <div id="login">
          <form action = "getProduct" method= "GET">
            	<input type="hidden" name="command" value="ADD">
              <div class="form-group">
                <label for="productName">Product Name</label>
                <input type="text" class="form-control" placeholder="Enter Product Name"  name="name">
              </div>
              <div class="form-group">
                <label for="urlInput">URL</label>
                <input type="url" class="form-control" aria-describedby="urlHelp" placeholder="Enter URL here" name="url">
                <small id="urlHelp" class="form-text text-muted">So that we can fetch the article and analyze it for you.</small>
              </div>
              <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
        <aside id="sidebar">
          <div class="dark">
            <h3>What We Do</h3>
            <p>
                Entered URL is used to fetch the article from web.<br><br>
                Article which is fetched from web is used to perform Sentiment Analysis.  
            </p>
          </div>
        </aside>
        <div style="clear:both"></div>
<p>
	<a href="getProduct"> Back to List</a>
</p>
      </div>
    </section>

    <footer id="add-product-footer">
      <p>BE Project Sentiment Analysis</p>
    </footer>
  </body>
</html>
