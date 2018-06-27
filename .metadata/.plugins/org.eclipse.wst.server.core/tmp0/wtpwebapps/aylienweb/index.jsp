<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <title>Sentiment Analysis</title>
</head>
<body>
    <!-- Nav bar starts here-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary rounded">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample10" aria-controls="navbarsExample10" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-md-center" id="navbarsExample10">
          <ul class="navbar-nav">
            <li class="nav-item active">
              <a class="nav-link" href="#">Analyze It <span class="sr-only">(current)</span></a>
            </li>
            
          </ul>
        </div>
      </nav>
      <!-- Nav bar ends -->

      <!-- URL Analyzer section starts here-->
      <section id="url">
        <div class="form-container">
        <form action="ArticleAnalyzer" method="GET">
          <div class="form-group">
              <label for="urlInput">Enter URL</label>
              <input type="url" name="URL"
               class="form-control" id="urlInput" placeholder="Enter URL here">
          </div>
          <input type="submit" class="btn btn-primary" >
        </form>
      </div>
      </section>
      <!-- URL section ends here -->
      
      <!-- Output Section starts here -->
    
      <section id = "output">
        <div class="output-container">
          
          <p id="optext">
            <% 
      			String output = (String)request.getAttribute("sentiment_output");
            	out.println(output);
       		%>
          	 
          </p>
  
        </div>
      </section>
      <!-- Output Section ends here -->

      
   
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>