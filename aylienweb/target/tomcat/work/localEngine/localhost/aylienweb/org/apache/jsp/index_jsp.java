package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("    <title>Sentiment Analysis</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Nav bar starts here-->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary rounded\">\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample10\" aria-controls=\"navbarsExample10\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-md-center\" id=\"navbarsExample10\">\r\n");
      out.write("          <ul class=\"navbar-nav\">\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">Analyze It <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("      <!-- Nav bar ends -->\r\n");
      out.write("\r\n");
      out.write("      <!-- URL Analyzer section starts here-->\r\n");
      out.write("      <section id=\"url\">\r\n");
      out.write("        <div class=\"form-container\">\r\n");
      out.write("        <form action=\"ArticleAnalyzer\" method=\"GET\">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("              <label for=\"urlInput\">Enter URL</label>\r\n");
      out.write("              <input type=\"url\" name=\"URL\"\r\n");
      out.write("               class=\"form-control\" id=\"urlInput\" placeholder=\"Enter URL here\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <input type=\"submit\" class=\"btn btn-primary\" >\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      </section>\r\n");
      out.write("      <!-- URL section ends here -->\r\n");
      out.write("      \r\n");
      out.write("      <!-- Output Section starts here -->\r\n");
      out.write("    \r\n");
      out.write("      <section id = \"output\">\r\n");
      out.write("        <div class=\"output-container\">\r\n");
      out.write("          \r\n");
      out.write("          <p id=\"optext\">\r\n");
      out.write("            ");
 
      			String output = (String)request.getAttribute("sentiment_output");
            	out.println(output);
       		
      out.write("\r\n");
      out.write("          \t \r\n");
      out.write("          </p>\r\n");
      out.write("  \r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("      <!-- Output Section ends here -->\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("   \r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
