package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_002dproduct_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("    <meta name=\"description\" content=\"Affordable and professional web design\">\r\n");
      out.write("\t<meta name=\"keywords\" content=\"web design, affordable web design, professional web design\">\r\n");
      out.write("    <meta name=\"author\" content=\"Ashish Dhase\">\r\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <title>Update Product</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/style.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <header>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div id=\"branding\">\r\n");
      out.write("          <h1><span class=\"highlight\">Sentiment</span> Analysis</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("   \r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"newsletter\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <h1>Add New Product</h1>\r\n");
      out.write("   \r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <section id=\"main\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("  \r\n");
      out.write("      <div id=\"login\">\r\n");
      out.write("          <form action = \"getProduct\" method= \"GET\">\r\n");
      out.write("              <input type=\"hidden\" name=\"command\" value=\"UPDATE\">\r\n");
      out.write("              <input type=\"hidden\" name=\"productId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${THE_PRODUCT.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"productName\">Product Name</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Enter Product Name\" name=\"name\"\r\n");
      out.write("                value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${THE_PRODUCT.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"urlInput\">URL</label>\r\n");
      out.write("                <input type=\"url\" name=\"url\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${THE_PRODUCT.url }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("                class=\"form-control\" aria-describedby=\"urlHelp\" placeholder=\"Enter URL here\">\r\n");
      out.write("                <small id=\"urlHelp\" class=\"form-text text-muted\">So that we can fetch the article and analyze it for you.</small>\r\n");
      out.write("              </div>\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <aside id=\"sidebar\">\r\n");
      out.write("          <div class=\"dark\">\r\n");
      out.write("            <h3>What We Do</h3>\r\n");
      out.write("            <p>\r\n");
      out.write("                Entered URL is used to fetch the article from web.<br><br>\r\n");
      out.write("                Article which is fetched from web is used to perform Sentiment Analysis.  \r\n");
      out.write("            </p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </aside>\r\n");
      out.write("        <div style=\"clear:both\"></div>\r\n");
      out.write("<p>\r\n");
      out.write("\t<a href=\"getProduct\"> Back to List</a>\r\n");
      out.write("</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <footer id=\"add-product-footer\">\r\n");
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
