package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class show_002dreview_002darticle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("    <meta name=\"description\" content=\"Affordable and professional web design\">\r\n");
      out.write("\t  <meta name=\"keywords\" content=\"web design, affordable web design, professional web design\">\r\n");
      out.write("    <meta name=\"author\" content=\"Ashish Dhase\">\r\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <title>Show Article</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/style.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <header>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div id=\"branding\">\r\n");
      out.write("          <h1><span class=\"highlight\">Sentiment</span> Analysis</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"newsletter\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <h1>Fetched Article</h1>\r\n");
      out.write(" \r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"main\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("  \r\n");
      out.write("      <div id=\"login\">\r\n");
      out.write("        ");

          String article = (String)request.getAttribute("REVIEW_ARTICLE");
        
      out.write("\r\n");
      out.write("          <form action = \"getProduct\" method= \"GET\" id=\"articleForm\">\r\n");
      out.write("              <input type=\"hidden\" name=\"command\" value=\"SENTIMENT\">\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                  <!--  <label for=\"article\">Fetched Article</label>-->\r\n");
      out.write("                    <textarea class=\"form-control\" id=\"articleTextarea\" rows=\"10\" disabled>\r\n");
      out.write("                      ");
      out.print( 
                        article
                      );
      out.write("\r\n");
      out.write("                    </textarea>\r\n");
      out.write("              </div>\r\n");
      out.write("              <input type=\"submit\" value=\"Analyze it\" class=\"btn btn-primary\" \r\n");
      out.write("               onclick=\"window.location.href = 'sentiment-analysis-result.jsp' \">\r\n");
      out.write("               \r\n");
      out.write("            </form>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write(" \r\n");
      out.write("        <aside id=\"sidebar\">\r\n");
      out.write("            <div class=\"dark\">\r\n");
      out.write("              <h3>Too Lazy to read long Article??</h3>\r\n");
      out.write("              <p>\r\n");
      out.write("                  Click on Analyze it<br><br>\r\n");
      out.write("                  We will analyze the article for you.  \r\n");
      out.write("              </p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </aside>\r\n");
      out.write("          <div style=\"clear:both\"></div>\r\n");
      out.write("          <p>\r\n");
      out.write("            <a href=\"getProduct\"> Back to List</a>\r\n");
      out.write("          </p>\r\n");
      out.write("      </div>\r\n");
      out.write("     \r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <footer id=\"article-footer\">\r\n");
      out.write("      <p>BE Project Sentiment Analysis</p>\r\n");
      out.write("    </footer>\r\n");
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
