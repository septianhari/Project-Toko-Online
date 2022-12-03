package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registreasi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            background-image: linear-gradient(to bottom, tan, burlywood, wheat);\n");
      out.write("        }\n");
      out.write("        .kotak_regristrasi{\n");
      out.write("                width: 350px;\n");
      out.write("                background-color: white;\n");
      out.write("                margin: 80px auto;\n");
      out.write("                padding: 30px 20px;\n");
      out.write("                opacity: 0.7;\n");
      out.write("                box-shadow: 0px 0px 20px 6px;  \n");
      out.write("                border-radius: 10px;\n");
      out.write("        }\n");
      out.write("        .input{\n");
      out.write("               box-sizing: border-box;\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 11pt;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .tombol{\n");
      out.write("                background-color: chocolate;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 11pt;\n");
      out.write("                width: 30%;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("        }\n");
      out.write("        .tombol:hover{\n");
      out.write("            background-color: peru;\n");
      out.write("            color: maroon;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .bawah{\n");
      out.write("            text-align: center;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .bawah a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: sienna;\n");
      out.write("        }\n");
      out.write("        .bawah a:hover{\n");
      out.write("            background-color: darkgoldenrod;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"kotak_regristrasi\">\n");
      out.write("            <h2>Create your Account</h2>\n");
      out.write("            <form method=\"POST\" action=\"prosesreg.jsp\">\n");
      out.write("            \n");
      out.write("                <label>Username*</label>\n");
      out.write("                <input type=\"text\" name=\"username\" value=\"\" class=\"input\" placeholder=\"---username---\"/>\n");
      out.write("                \n");
      out.write("                <label>Contact*</label>\n");
      out.write("                <input type=\"text\" name=\"kontak\" value=\"\" class=\"input\" placeholder=\"---contact---\"/>\n");
      out.write("                \n");
      out.write("                <label>Alamat*</label>\n");
      out.write("                <input type=\"text\" name=\"alamat\" value=\"\" class=\"input\" placeholder=\"---alamat---\"/>\n");
      out.write("                \n");
      out.write("                <label>Status*</label>\n");
      out.write("                <select name=\"status\" class=\"input\">\n");
      out.write("                    <option>---Pilih status---</option>\n");
      out.write("                         <option>Customer</option>\n");
      out.write("                         <option>Toko</option>\n");
      out.write("                </select>\n");
      out.write("                \n");
      out.write("                <label>Password*</label>\n");
      out.write("                <input type=\"password\" name=\"password\" value=\"\" class=\"input\" placeholder=\"---password---\"/>\n");
      out.write("                \n");
      out.write("                <label>Email*</label>\n");
      out.write("                <input type=\"text\" name=\"email\" value=\"\" class=\"input\" placeholder=\"---email---\"/>\n");
      out.write("                \n");
      out.write("                <input type=\"submit\" value=\"Submit\" class=\"tombol\"/>\n");
      out.write("                <input type=\"reset\" value=\"Reset\" class=\"tombol\"/>\n");
      out.write("      \n");
      out.write("           \n");
      out.write("        </form><hr> <h3 class=\"bawah\">Already registered!! <a href=\"index.jsp\">Login Here</a></h3>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
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
