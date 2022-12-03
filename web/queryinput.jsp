<%-- 
    Document   : queryinput
    Created on : Jul 3, 2019, 4:02:04 AM
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
    <style>
        body{
            padding: 20px 30%;
        }
        h2{
            color: darkred;
            letter-spacing: 10px;
        }
        a{
            text-decoration: none;
            color: indianred;
        }
        a:hover{
            text-decoration: underline;
            color: darkred;
        }
    </style>
    <body>
        <%
            String kode = request.getParameter("kodeproduk");
            String nama = request.getParameter("nama");
            String harga = request.getParameter("harga"); 
            String qty = request.getParameter("qty");
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprojek","root","");
            Statement st = cn.createStatement();
            st.executeUpdate("insert into produk (kd_produk, nm_produk, harga_produk, qty) values ('" + kode + "','" + nama + "','" + harga + "','" + qty + "')");
        %>
        <h2>Berhasil Disave!!!</h2>
        <a href="tampilbarang.jsp">+ Tampilkan List Barang</a><hr>
    </body>
</html>
