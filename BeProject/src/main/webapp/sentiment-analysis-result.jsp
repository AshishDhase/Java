<%@ page import = "com.aylien.textapi.responses.Sentiment" %>
<%@ page import = "com.project.graph.GraphValues" %>
<%@ page import = "java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.min.js"></script>
    <script type="text/javascript" src="graph_values.json"></script>
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
        <h1>Result of Sentiment Analysis</h1>
     
      </div>
    </section>

    <section id="main">
      <div class="container">
 		
        <%
          String sentiment = (String)request.getAttribute("SENTIMENT_RESULT");
        
        %>
       
        
        <div id="result-container">
            <p id="result">
              <%= sentiment %>
 
             
            </p>
                <a href="getProduct" class="btn btn-outline-secondary btn-lg btn-block">Back to the list</a>
        </div>
        
        <div id="graph-container">
        	<canvas id="myChart"></canvas>
        </div>
    
      </div>

    </section>

    <footer id="article-footer">
      <p>BE Project Sentiment Analysis</p>
    </footer>
    
         <script
			  src="https://code.jquery.com/jquery-3.3.1.min.js"
			  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
			  crossorigin="anonymous"></script>
			  
			  <script>
			  
			    var positive;
			    function readTextFile(file, callback) {
			    var rawFile = new XMLHttpRequest();
			    rawFile.overrideMimeType("application/json");
			    rawFile.open("GET", file, true);
			    rawFile.onreadystatechange = function() {
			        if (rawFile.readyState === 4 && rawFile.status == "200") {
			            callback(rawFile.responseText);
			        }
			    }
			    rawFile.send(null);
			}

			//usage:
			readTextFile("graph_values.json", function(text){
			    var data = JSON.parse(text);
			    console.log(data);
			    positive = data.positive_percent;
			    negative = data.negative_percent;
			    console.log(positive);

			    // Global Options
			    Chart.defaults.global.defaultFontFamily = 'Lato';
			    Chart.defaults.global.defaultFontSize = 18;
			    Chart.defaults.global.defaultFontColor = '#777';
			    console.log("in chart"+positive);
			    var massPopChart = new Chart(myChart, {
			      type:'bar', // bar, horizontalBar, pie, line, doughnut, radar, polarArea
			      
			      data:{
			        labels:['Positive', 'Negative'],
			        datasets:[{
			          label:'Sentiment Analysis',
			          data:[
			            positive,
			            negative,
			          ],
			          //backgroundColor:'green',
			          backgroundColor:[
			            'rgba(255, 99, 132, 0.6)',
			            'rgba(54, 162, 235, 0.6)',
			          ],
			          borderWidth:1,
			          borderColor:'#777',
			          hoverBorderWidth:3,
			          hoverBorderColor:'#000'
			        }]
			      },
			      options:{
			        title:{
			          display:true,
			          text:'Sentiment Analysis',
			          fontSize:25
			        },
			        legend:{
			          display:false,
			          position:'right',
			          labels:{
			            fontColor:'#000'
			          }
			        },
			        layout:{
			          padding:{
			            left:50,
			            right:0,
			            bottom:0,
			            top:0
			          }
			        },
			        tooltips:{
			          enabled:true
			        }
			      }
			    });
			});

			  </script>
	
<!-- 		<script type="text/javascript" src="app.js"></script> -->
  </body>
</html>
