<%-- 
    Document   : tampil_transaksi
    Created on : Jul 2, 2019, 1:21:04 PM
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
            padding: 5% 25%;
            box-shadow:  indianred 0px 0px 10px 6px;
        }
        a{
            text-decoration: none;
            color: darkred;
        }
        a:hover{
            color: lightcoral;
            text-decoration: underline;
        }
        h1{
            color: darkred;
        }
        .head{
            background-image: linear-gradient(to right, pink, darkred);
            color: white;
        }
        .bodi{
           background-image: linear-gradient(to right, palevioletred, lightpink);
            color: white;
        }
    </style>
    <body>
        <h1>Bukti Transaksi...</h1>
        <table border="1">
            <thead>
                <tr class="head">
                    <th>No</th>
                    <th>Nama</th>
                    <th>No.Hp</th>
                    <th>Alamat</th>
                    <th>Pembayaran</th>
                    <th>Total Belanja</th>
                </tr>
            </thead>
            <tbody class="bodi">
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprojek","root","");
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery("select * from transaksi");
                    int nomor=1;
                    while(rs.next()){
                %>
                <tr>
                    <td><% out.print(nomor++); %></td>
                    <td><% out.print(rs.getString(1)); %></td>
                    <td><% out.print(rs.getString(2)); %></td>
                    <td><% out.print(rs.getString(3)); %></td>
                    <td><% out.print(rs.getString(4)); %></td>
                    <td>Rp.<% out.print(rs.getString(5)); %></td>
                </tr>
                <% } %>
            </tbody>
        </table>
            <br>
            
         <a href="tampilan_admin.jsp">Kembali...Click me!!</a>
    </body>
</html>
