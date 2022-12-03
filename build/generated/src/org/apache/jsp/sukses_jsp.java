package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.produk;

public final class sukses_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            padding: 0px 20px;\n");
      out.write("        }\n");
      out.write("        h1{\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        header{\n");
      out.write("            background-color: indianred;\n");
      out.write("        }\n");
      out.write("        .link{\n");
      out.write("            padding: 10px 12px;\n");
      out.write("            background-color: grey;\n");
      out.write("        }\n");
      out.write("        .link a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: black;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("        .link a:hover{\n");
      out.write("            background-color: #eaeaea;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px 12px;\n");
      out.write("         \n");
      out.write("        }\n");
      out.write("        .masuk{\n");
      out.write("            background-color: lightcoral;\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("        .masuk h1{\n");
      out.write("            letter-spacing: 5px;\n");
      out.write("        }\n");
      out.write("        .out{\n");
      out.write("            padding: 10px 12px;\n");
      out.write("            background-color: lightcoral;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        .out a{\n");
      out.write("            padding : 10px 12px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .out a:hover{\n");
      out.write("            padding: 10px 12px;\n");
      out.write("            background-color: white;\n");
      out.write("            color: darkred;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            letter-spacing: 10px;\n");
      out.write("            text-decoration: underline;\n");
      out.write("            color: darkred;\n");
      out.write("        }\n");
      out.write("        .button{\n");
      out.write("            width: 50%;\n");
      out.write("            color: white;\n");
      out.write("            background-color: indianred;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            ");

               if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
           
      out.write("\n");
      out.write("           <h1>Anda Belum login</h1>\n");
      out.write("           <div class=\"link\">\n");
      out.write("               <a href=\"index.jsp\">Silahkan Login</a>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           ");
} else {
           
      out.write("\n");
      out.write("           <div class=\"masuk\">\n");
      out.write("               <h1>Welcome ");
      out.print(session.getAttribute("userid"));
      out.write(":))</h1>\n");
      out.write("               <p align=\"center\">Share of wallet!!!</p>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"out\">\n");
      out.write("               <a href='logout.jsp'>Log out?? Click me!!</a>\n");
      out.write("           </div><hr>\n");
      out.write("\n");
      out.write("           ");

           }
           
      out.write("\n");
      out.write("        </header>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <h2 align=\"center\">...Daftar Produk...</h2>\n");
      out.write(" \n");
      out.write("                    ");

                        produk pm = new produk();
                        List <produk> data = new ArrayList<produk>();
                        String ket = request.getParameter("ket");
                        if (ket == null) {
                            data = pm.tampil();
                        }
                        for (int x = 0; x < data.size(); x++) {
                    
      out.write("\n");
      out.write("        <table width=\"75%\" border=\"1\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <form name=\"ModelDetail\" method=\"POST\" action=\"kontrol_barang\" align=\"center\">\n");
      out.write("                        Kode Produk : ");
      out.print(data.get(x).getKd_produk());
      out.write(" <input type=\"hidden\" name=\"kd_produk\" value=\"");
      out.print(data.get(x).getKd_produk());
      out.write("\"><br>\n");
      out.write("                        Nama Produk : ");
      out.print(data.get(x).getNm_produk());
      out.write("<input type=\"hidden\" name=\"nm_produk\" value=\"");
      out.print(data.get(x).getNm_produk());
      out.write("\"><br>\n");
      out.write("                        Harga : ");
      out.print(data.get(x).getHarga_produk());
      out.write(" <input type=\"hidden\" name=\"harga\" value=\"");
      out.print(data.get(x).getHarga_produk());
      out.write("\"><br>\n");
      out.write("                        Stok : ");
      out.print(data.get(x).getQty());
      out.write(" <input type=\"hidden\" name=\"harga\" value=\"");
      out.print(data.get(x).getQty());
      out.write("\"><br>\n");
      out.write("                        Quantity :<input type=\"text\" name=\"qty\" placeholder=\"--isi qty---\"/><br><br>\n");
      out.write("                        <input type=\"hidden\" name=\"action\" value=\"add\">\n");
      out.write("                        <input type=\"submit\" name=\"addToCart\" value=\"Add To Cart\" class=\"button\">\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        ");
 }
      out.write("\n");
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
