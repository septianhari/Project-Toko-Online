package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class transaksi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("         body{\n");
      out.write("            padding: 5% 40%;\n");
      out.write("            box-shadow:  indianred 0px 0px 10px 6px;\n");
      out.write("        }\n");
      out.write("        .keluar a{\n");
      out.write("            color: darkred;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");

            String nama = request.getParameter("nm");
            String nohp = request.getParameter("hp");
            String alamat = request.getParameter("almt"); 
            String pilihpembayaran = request.getParameter("pilih_pembayaran");
            String total = request.getParameter("total");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprojek","root","");
            Statement st = cn.createStatement();
            st.executeUpdate("insert into transaksi (nama, no_hp, alamat, pilih_pembayaran, total_harga) values ('" + nama + "','" + nohp + "','" + alamat + "','" + pilihpembayaran + "','" + total + "')");
        
      out.write("  \n");
      out.write("        <h1>Bukti Pembayaran</h1>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Transaksi Atas Nama </td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td>");
 out.print(nama);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>No Hp</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td>");
out.print(nohp);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Alamat</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td>");
out.print(alamat);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Pilih Pembayaran</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td>");
out.print(pilihpembayaran);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Total Pembelian</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td>");
out.print(total);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"keluar\"><a href=\"logout.jsp\">Log Out?..</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
