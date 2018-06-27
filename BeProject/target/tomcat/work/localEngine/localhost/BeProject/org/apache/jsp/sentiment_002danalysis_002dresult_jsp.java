package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.aylien.textapi.responses.Sentiment;
import com.project.graph.GraphValues;
import java.util.*;

public final class sentiment_002danalysis_002dresult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("   <meta charset=\"utf-8\"> \r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("    <meta name=\"description\" content=\"Affordable and professional web design\">\r\n");
      out.write("\t  <meta name=\"keywords\" content=\"web design, affordable web design, professional web design\">\r\n");
      out.write("    <meta name=\"author\" content=\"Ashish Dhase\">\r\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"graph_values.json\"></script>\r\n");
      out.write("    <title>Add Product</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/style.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <header>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div id=\"branding\">\r\n");
      out.write("          <h1><span class=\"highlight\">Sentiment</span> Analysis</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("  \r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"newsletter\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <h1>Result of Sentiment Analysis</h1>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"main\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write(" \t\t\r\n");
      out.write("        ");

          String sentiment = (String)request.getAttribute("SENTIMENT_RESULT");
        
        
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        <div id=\"result-container\">\r\n");
      out.write("            <p id=\"result\">\r\n");
      out.write("              ");
      out.print( sentiment );
      out.write("\r\n");
      out.write(" \r\n");
      out.write("             \r\n");
      out.write("            </p>\r\n");
      out.write("                <a href=\"getProduct\" class=\"btn btn-outline-secondary btn-lg btn-block\">Back to the list</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"graph-container\">\r\n");
      out.write("        \t<canvas id=\"myChart\"></canvas>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <footer id=\"article-footer\">\r\n");
      out.write("      <p>BE Project Sentiment Analysis</p>\r\n");
      out.write("    </footer>\r\n");
      out.write("    \r\n");
      out.write("         <script\r\n");
      out.write("\t\t\t  src=\"https://code.jquery.com/jquery-3.3.1.min.js\"\r\n");
      out.write("\t\t\t  integrity=\"sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=\"\r\n");
      out.write("\t\t\t  crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  <script>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t    var positive;\r\n");
      out.write("\t\t\t    function readTextFile(file, callback) {\r\n");
      out.write("\t\t\t    var rawFile = new XMLHttpRequest();\r\n");
      out.write("\t\t\t    rawFile.overrideMimeType(\"application/json\");\r\n");
      out.write("\t\t\t    rawFile.open(\"GET\", file, true);\r\n");
      out.write("\t\t\t    rawFile.onreadystatechange = function() {\r\n");
      out.write("\t\t\t        if (rawFile.readyState === 4 && rawFile.status == \"200\") {\r\n");
      out.write("\t\t\t            callback(rawFile.responseText);\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t    rawFile.send(null);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t//usage:\r\n");
      out.write("\t\t\treadTextFile(\"graph_values.json\", function(text){\r\n");
      out.write("\t\t\t    var data = JSON.parse(text);\r\n");
      out.write("\t\t\t    console.log(data);\r\n");
      out.write("\t\t\t    positive = data.positive_percent;\r\n");
      out.write("\t\t\t    negative = data.negative_percent;\r\n");
      out.write("\t\t\t    console.log(positive);\r\n");
      out.write("\r\n");
      out.write("\t\t\t    // Global Options\r\n");
      out.write("\t\t\t    Chart.defaults.global.defaultFontFamily = 'Lato';\r\n");
      out.write("\t\t\t    Chart.defaults.global.defaultFontSize = 18;\r\n");
      out.write("\t\t\t    Chart.defaults.global.defaultFontColor = '#777';\r\n");
      out.write("\t\t\t    console.log(\"in chart\"+positive);\r\n");
      out.write("\t\t\t    var massPopChart = new Chart(myChart, {\r\n");
      out.write("\t\t\t      type:'bar', // bar, horizontalBar, pie, line, doughnut, radar, polarArea\r\n");
      out.write("\t\t\t      \r\n");
      out.write("\t\t\t      data:{\r\n");
      out.write("\t\t\t        labels:['Positive', 'Negative'],\r\n");
      out.write("\t\t\t        datasets:[{\r\n");
      out.write("\t\t\t          label:'Sentiment Analysis',\r\n");
      out.write("\t\t\t          data:[\r\n");
      out.write("\t\t\t            positive,\r\n");
      out.write("\t\t\t            negative,\r\n");
      out.write("\t\t\t          ],\r\n");
      out.write("\t\t\t          //backgroundColor:'green',\r\n");
      out.write("\t\t\t          backgroundColor:[\r\n");
      out.write("\t\t\t            'rgba(255, 99, 132, 0.6)',\r\n");
      out.write("\t\t\t            'rgba(54, 162, 235, 0.6)',\r\n");
      out.write("\t\t\t          ],\r\n");
      out.write("\t\t\t          borderWidth:1,\r\n");
      out.write("\t\t\t          borderColor:'#777',\r\n");
      out.write("\t\t\t          hoverBorderWidth:3,\r\n");
      out.write("\t\t\t          hoverBorderColor:'#000'\r\n");
      out.write("\t\t\t        }]\r\n");
      out.write("\t\t\t      },\r\n");
      out.write("\t\t\t      options:{\r\n");
      out.write("\t\t\t        title:{\r\n");
      out.write("\t\t\t          display:true,\r\n");
      out.write("\t\t\t          text:'Sentiment Analysis',\r\n");
      out.write("\t\t\t          fontSize:25\r\n");
      out.write("\t\t\t        },\r\n");
      out.write("\t\t\t        legend:{\r\n");
      out.write("\t\t\t          display:false,\r\n");
      out.write("\t\t\t          position:'right',\r\n");
      out.write("\t\t\t          labels:{\r\n");
      out.write("\t\t\t            fontColor:'#000'\r\n");
      out.write("\t\t\t          }\r\n");
      out.write("\t\t\t        },\r\n");
      out.write("\t\t\t        layout:{\r\n");
      out.write("\t\t\t          padding:{\r\n");
      out.write("\t\t\t            left:50,\r\n");
      out.write("\t\t\t            right:0,\r\n");
      out.write("\t\t\t            bottom:0,\r\n");
      out.write("\t\t\t            top:0\r\n");
      out.write("\t\t\t          }\r\n");
      out.write("\t\t\t        },\r\n");
      out.write("\t\t\t        tooltips:{\r\n");
      out.write("\t\t\t          enabled:true\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t      }\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t  </script>\r\n");
      out.write("\t\r\n");
      out.write("<!-- \t\t<script type=\"text/javascript\" src=\"app.js\"></script> -->\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
