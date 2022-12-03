<%-- 
    Document   : transaksi
    Created on : Jun 14, 2019, 11:32:18 AM
    Author     : upi mariani
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
         body{
            padding: 5% 40%;
            box-shadow:  indianred 0px 0px 10px 6px;
        }
        .keluar a{
            color: darkred;
        }
    </style>
    <body>
        <%
            String nama = request.getParameter("nm");
            String nohp = request.getParameter("hp");
            String alamat = request.getParameter("almt"); 
            String pilihpembayaran = request.getParameter("pilih_pembayaran");
            String total = request.getParameter("total");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprojek","root","");
            Statement st = cn.createStatement();
            st.executeUpdate("insert into transaksi (nama, no_hp, alamat, pilih_pembayaran, total_harga) values ('" + nama + "','" + nohp + "','" + alamat + "','" + pilihpembayaran + "','" + total + "')");
        %>  
        <h1>Bukti Pembayaran</h1>
        <table>
            <tr>
                <td>Transaksi Atas Nama </td>
                <td>:</td>
                <td><% out.print(nama);%></td>
            </tr>
            <tr>
                <td>No Hp</td>
                <td>:</td>
                <td><%out.print(nohp);%></td>
            </tr>
            <tr>
                <td>Alamat</td>
                <td>:</td>
                <td><%out.print(alamat);%></td>
            </tr>
            <tr>
                <td>Pilih Pembayaran</td>
                <td>:</td>
                <td><%out.print(pilihpembayaran);%></td>
            </tr>
            <tr>
                <td>Total Pembelian</td>
                <td>:</td>
                <td><%out.print(total);%></td>
            </tr>
            <tr>
                <td class="keluar"><a href="logout.jsp">Log Out?..</a></td>
            </tr>
        </table>
    </body>
</html>
