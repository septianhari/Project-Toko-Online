<%-- 
    Document   : tampilbarang
    Created on : Jul 2, 2019, 3:11:47 AM
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
            padding: 70px 25%;
        }
        h1{
            color: darkred;
        }
        .head{
            background-image: linear-gradient(to right, palevioletred, darkred);
            color: white;
        }
        a{
            text-decoration: none;
            color: darkred;
        }
        a:hover{
            color: lightcoral;
            text-decoration: underline;
        }
    </style>
    <body>
        <h1>List Barang...</h1>
        <table border="1">
            <thead>
                <tr class="head">
                    <th>No</th>
                    <th>Id Produk</th>
                    <th>Kode Produk</th>
                    <th>Nama Produk</th>
                    <th>Harga Produk</th>
                    <th>Quantity</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprojek","root","");
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery("select * from produk");
                    int nomor=1;
                    while(rs.next()){
                %>
                <tr>
                    <td><% out.print(nomor++); %></td>
                    <td><% out.print(rs.getString(1)); %></td>
                    <td><% out.print(rs.getString(2)); %></td>
                    <td><% out.print(rs.getString(3)); %></td>
                    <td><% out.print(rs.getString(4)); %></td>
                    <td><% out.print(rs.getString(4)); %></td>
                    <td><a href="editbarang.jsp?kode=<% out.print(rs.getString(1)); %>">Edit</a>
                        <a href="hapusbarang.jsp?kode=<% out.print(rs.getString(1)); %>">Hapus</a></td>
                </tr>
                <% } %>
            </tbody>
        </table>
            <a href="input_databarang.jsp">+ Tambah Data Barang</a>
            <br><br>
            <a href="tampilan_admin.jsp">Kembali...Click me!!</a>
        <hr>
    </body>
</html>
