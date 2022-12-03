<%-- 
    Document   : hapusbarang
    Created on : Jul 2, 2019, 3:25:02 AM
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
            String kode = request.getParameter("kode");
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprojek","root","");
            Statement st = cn.createStatement();
            st.executeUpdate("delete from produk where id_produk='"+ kode +"'");
        %>
        <h2>Berhasil Delete!!!</h2>
        <a href="tampilbarang.jsp">+ Tampilkan List Barang</a><hr>
        
    </body>
</html>
