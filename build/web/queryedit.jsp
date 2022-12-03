<%-- 
    Document   : queryedit
    Created on : Jul 2, 2019, 3:36:42 AM
    Author     : upi mariani
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String kode=request.getParameter("idproduk");
            String kodeproduk=request.getParameter("kodeproduk");
            String nama=request.getParameter("namaproduk");
            String harga=request.getParameter("hargaproduk");
            String qty=request.getParameter("qtyproduk");
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprojek","root","");
            Statement st = cn.createStatement();
            st.executeUpdate("update produk set kd_produk='"+kodeproduk+"',nm_produk='"+nama+"',harga_produk='"+harga+"',qty='"+qty+"' where id_produk='"+kode+"'");
        %>
    </body>
</html>
