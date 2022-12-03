package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/csslogin.css.jsp\">\n");
      out.write("    </head>\n");
      out.write("        <style>\n");
      out.write("     body{\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("\t\n");
      out.write("        }\n");
      out.write("        .tulisan_login{\n");
      out.write("                text-align: center;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("        }\n");
      out.write("        .kotak_login{\n");
      out.write("                width: 350px;\n");
      out.write("                background-color: white;\n");
      out.write("                margin: 80px auto;\n");
      out.write("                padding: 30px 20px;\n");
      out.write("                opacity: 0.9;\n");
      out.write("                box-shadow: 0px 0px 20px 6px;  \n");
      out.write("                border-radius: 10px;\n");
      out.write("        }\n");
      out.write("        label{\n");
      out.write("                font-size: 11pt;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form_login{\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 11pt;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .form_login:hover{\n");
      out.write("            background-color: firebrick;\n");
      out.write("            outline-style: none; \n");
      out.write("        }\n");
      out.write("        .form_login:focus{\n");
      out.write("            background-color: lightcoral;\n");
      out.write("        }\n");
      out.write("        .tombol_login{\n");
      out.write("                background-color: firebrick;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 11pt;\n");
      out.write("                width: 48%;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                \n");
      out.write("              \n");
      out.write("        }\n");
      out.write("        .tombol_login:hover{\n");
      out.write("            background-color: indianred;\n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: black;\n");
      out.write("            letter-spacing: 3px;\n");
      out.write("            font-size: 10pt;\n");
      out.write("        }\n");
      out.write("        a:hover{\n");
      out.write("            color: darkred;\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("       \n");
      out.write("    <body>\n");
      out.write("\t<div class=\"kotak_login\">\n");
      out.write("            <p class=\"tulisan_login\">Please enter an Account</p>\n");
      out.write("\t\t<form method=\"POST\" action=\"login.jsp\">\n");
      out.write("\t\t\t<label>Username</label>\n");
      out.write("\t\t\t<input type=\"text\" name=\"username\" class=\"form_login\" placeholder=\"Username ...\">\n");
      out.write("\n");
      out.write("\t\t\t<label>Password</label>\n");
      out.write("                        <input type=\"password\" name=\"password\" class=\"form_login\" placeholder=\"Password...\">\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" class=\"tombol_login\" value=\"Login\"/>\n");
      out.write("                        <input type=\"reset\" class=\"tombol_login\" value=\"Reset\" />\n");
      out.write("\t\t\t<center>\n");
      out.write("                            \n");
      out.write("                            <a href=\"registreasi.jsp\">Register Here!!</a>\n");
      out.write("\t\t\t</center>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
