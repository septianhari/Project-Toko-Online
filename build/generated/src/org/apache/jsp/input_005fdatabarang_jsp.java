package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class input_005fdatabarang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            padding: 5% 30%;\n");
      out.write("            box-shadow:  indianred 0px 0px 10px 6px;\n");
      out.write("        }\n");
      out.write("        .tombol{\n");
      out.write("            background-color: firebrick;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 8pt;\n");
      out.write("                width: 48%;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 10px 10px;\n");
      out.write("        }\n");
      out.write("        .tombol:hover{\n");
      out.write("            background-color: indianred;\n");
      out.write("        }\n");
      out.write("        .teks{\n");
      out.write("            box-sizing: border-box;\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 5px;\n");
      out.write("                font-size: 10pt;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("        .text:hover{\n");
      out.write("            background-color: indianred;\n");
      out.write("            outline-style: none; \n");
      out.write("        }\n");
      out.write("        .text:focus{\n");
      out.write("             background-color: lightcoral;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            color: darkred;\n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: darkred;\n");
      out.write("        }\n");
      out.write("        a:hover{\n");
      out.write("            color: lightcoral;\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");

            String kode = request.getParameter("kodeproduk");
            String nama = request.getParameter("nama");
            String harga = request.getParameter("harga"); 
            String qty = request.getParameter("qty");
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprojek","root","");
            Statement st = cn.createStatement();
            st.executeUpdate("insert into produk (kd_produk, nm_produk, harga_produk, qty) values ('" + kode + "','" + nama + "','" + harga + "','" + qty + "')");
        
      out.write("\n");
      out.write("        <h1>Tambah Data Barang...</h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Kode Produk</th>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"kodeproduk\" class=\"teks\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Nama Produk</th>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nama\" class=\"teks\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Harga Produk</th>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"harga\" class=\"teks\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Qty</th>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"qty\" class=\"teks\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td>&nbsp;</td>\n");
      out.write("                    <td><input type=\"submit\" name=\"submit\" value=\"SIMPAN\" class=\"tombol\">\n");
      out.write("                        <input type=\"reset\" name=\"reset\" value=\"RESET\" class=\"tombol\"</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <a href=\"tampilbarang.jsp\">+ Tampilkan Data Barang</a>\n");
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
