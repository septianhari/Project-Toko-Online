package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <script>\n");
      out.write("         function rekening(){\n");
      out.write("             var seleksi = document.data.pilihan.value;\n");
      out.write("             if(seleksi==\"BRI\"){\n");
      out.write("                 document.data.pilih_pembayaran.value=\"BRI\";\n");
      out.write("                 document.data.rek.value=\"09873291738\";\n");
      out.write("             }\n");
      out.write("             if(seleksi==\"BNI\"){\n");
      out.write("                 document.data.pilih_pembayaran.value=\"BNI\";\n");
      out.write("                 document.data.rek.value=\"0563322211\";\n");
      out.write("             }\n");
      out.write("             if(seleksi==\"COD\"){\n");
      out.write("                 document.data.pilih_pembayaran.value=\"COD\";\n");
      out.write("                 document.data.rek.value=\"-\";\n");
      out.write("             }\n");
      out.write("             if(seleksi==\"Alfamart\"){\n");
      out.write("                 document.data.pilih_pembayaran.value=\"Alfamart\";\n");
      out.write("                 document.data.rek.value=\"kunjungi alfamart terdekat\";\n");
      out.write("             }\n");
      out.write("             if(seleksi==\"Indomaret\"){\n");
      out.write("                 document.data.pilih_pembayaran.value=\"Indomaret\";\n");
      out.write("                 document.data.rek.value=\"kunjungi indomaret terdekat\";\n");
      out.write("             }\n");
      out.write("         }\n");
      out.write("        function hitung(){\n");
      out.write("                var tempat = document.data.kawasan.value;\n");
      out.write("\t\tif (tempat==\"Barat\") {                  \n");
      out.write("                        document.data.tempat.value=\"Kuningan Barat\";\n");
      out.write("                        document.data.ongkir.value=\"5000\";\n");
      out.write("                        var a = parseInt(document.data.harga.value);\n");
      out.write("                        document.data.total.value=5000+a;       \n");
      out.write("\t\t}\n");
      out.write("                if (tempat==\"Timur\") {                  \n");
      out.write("                        document.data.tempat.value=\"Kuningan Timur\";\n");
      out.write("                        document.data.ongkir.value=\"3500\";\n");
      out.write("                        var b = parseInt(document.data.harga.value);\n");
      out.write("                        document.data.total.value=3500+b;       \n");
      out.write("\t\t}\n");
      out.write("                if (tempat==\"Selatan\") {                  \n");
      out.write("                        document.data.tempat.value=\"Kuningan Selatan\";\n");
      out.write("                        document.data.ongkir.value=\"4000\";\n");
      out.write("                        var c = parseInt(document.data.harga.value);\n");
      out.write("                        document.data.total.value=4000+c;       \n");
      out.write("\t\t}\n");
      out.write("                if (tempat==\"Utara\") {                  \n");
      out.write("                        document.data.tempat.value=\"Kuningan Utara\";\n");
      out.write("                        document.data.ongkir.value=\"4500\";\n");
      out.write("                        var d = parseInt(document.data.harga.value);\n");
      out.write("                        document.data.total.value=4500+d;       \n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            padding: 5% 45%;\n");
      out.write("            box-shadow:  indianred 0px 0px 10px 6px;\n");
      out.write("        }\n");
      out.write("        .buat{\n");
      out.write("            width: 100%;\n");
      out.write("            background-color: darkred;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px 5px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            letter-spacing: 5px;\n");
      out.write("        }\n");
      out.write("        .klik{\n");
      out.write("            width: 100%;\n");
      out.write("            background-color: indianred;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        h1{\n");
      out.write("            color: darkred;\n");
      out.write("        }\n");
      out.write("        .label{\n");
      out.write("            color: firebrick;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <h1>Transaksi Atas Nama</h1>\n");
      out.write("       <form name=\"data\" method=\"POST\" action=\"transaksi.jsp\">\n");
      out.write("             <table align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Nama</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"nm\" placeholder=\"---isi nama anda---\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">No.Hp</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"hp\" placeholder=\"---isi no hp anda---\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Alamat</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"almt\" placeholder=\"---isi alamat anda---\" align=\"center\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"label\"><label>Pembayaran</label></td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"pilihan\">\n");
      out.write("                            <option>Pilih Pembayaran Via</option>\n");
      out.write("                            <option>BRI</option>\n");
      out.write("                            <option>BNI</option>\n");
      out.write("                            <option>COD</option>\n");
      out.write("                            <option>Alfamart</option>\n");
      out.write("                            <option>Indomaret</option>\n");
      out.write("                        </select>\n");
      out.write("                        <input type=\"button\" value=\"Via\" onclick=\"rekening()\" class=\"klik\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"label\">Via Pembayaran</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pilih_pembayaran\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"label\">No Rekening</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"rek\"</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"label\">Tempat Pengiriman</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><select  name=\"kawasan\">\n");
      out.write("                            <option>Pilih Kawasan Kuningan</option>\n");
      out.write("                            <option>Barat</option>\n");
      out.write("                            <option>Timur</option>\n");
      out.write("                            <option>Selatan</option>\n");
      out.write("                            <option>Utara</option>\n");
      out.write("                        </select>\n");
      out.write("                        <input type=\"button\" name=\"proses\" value=\"Proses\" onclick=\"hitung()\" class=\"klik\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"label\">Kawasan Pengiriman</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"tempat\"</td>\n");
      out.write("                </tr>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td class=\"label\">Harga Beli</td>\n");
      out.write("                    <td>:Rp.</td>\n");
      out.write("                    <td><input type=\"text\" name=\"harga\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.orderTotal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"label\">Biaya Pengiriman</td>\n");
      out.write("                    <td>:Rp.</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ongkir\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td class=\"label\">Total Harga</td>\n");
      out.write("                    <td>:Rp.</td>\n");
      out.write("                    <td><input type=\"text\" name=\"total\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<br>\n");
      out.write("                <tr>\n");
      out.write("                    <td>==================================</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"Buat Pesanan\" class=\"buat\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("        </form>\n");
      out.write("            \n");
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
