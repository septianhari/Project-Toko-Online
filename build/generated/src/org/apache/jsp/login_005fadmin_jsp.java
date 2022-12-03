package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            padding: 10% 40%;\n");
      out.write("        }\n");
      out.write("        .tombol{\n");
      out.write("             background-color: firebrick;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 11pt;\n");
      out.write("                width: 48%;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("        }\n");
      out.write("        .text{\n");
      out.write("              box-sizing: border-box;\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 11pt;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .kotak{\n");
      out.write("            width: 350px;\n");
      out.write("            margin: 80px auto;\n");
      out.write("            padding: 30px 20px;\n");
      out.write("            opacity: 0.9;\n");
      out.write("            box-shadow: darkred 0px 0px 15px 6px;  \n");
      out.write("            border-radius: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"kotak\">\n");
      out.write("             <form method=\"post\" action=\"login_prosesadmin.jsp\">\n");
      out.write("            <label>Username</label>\n");
      out.write("            <input type=\"text\" name=\"admin\" class=\"text\"><br>\n");
      out.write("            <label>Password</label>\n");
      out.write("            <input type=\"password\" name=\"password\" class=\"text\"><br>\n");
      out.write("            \n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"Masuk\" class=\"tombol\">\n");
      out.write("                <input type=\"reset\" name=\"reset\" value=\"Reset\" class=\"tombol\">\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("       \n");
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
