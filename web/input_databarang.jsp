<%-- 
    Document   : input_databarang
    Created on : Jul 1, 2019, 12:29:24 PM
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
            padding: 5% 30%;
            box-shadow:  indianred 0px 0px 10px 6px;
        }
        .tombol{
            background-color: firebrick;
                color: white;
                font-size: 8pt;
                width: 48%;
                border: none;
                border-radius: 10px;
                padding: 10px 10px;
        }
        .tombol:hover{
            background-color: indianred;
        }
        .teks{
            box-sizing: border-box;
                width: 100%;
                padding: 5px;
                font-size: 10pt;
                margin-bottom: 10px;
        }
        .text:hover{
            background-color: indianred;
            outline-style: none; 
        }
        .text:focus{
             background-color: lightcoral;
        }
        h2{
            color: darkred;
        }
        
    </style>
    <body>
       
        <h1>Tambah Data Barang...</h1>
        <form method="post" action="queryinput.jsp">
            <table>
                <tr>
                    <th>Kode Produk</th>
                    <td>:</td>
                    <td><input type="text" name="kodeproduk" class="teks"></td>
                </tr>
                <tr>
                    <th>Nama Produk</th>
                    <td>:</td>
                    <td><input type="text" name="nama" class="teks"></td>
                </tr>
                <tr>
                    <th>Harga Produk</th>
                    <td>:</td>
                    <td><input type="text" name="harga" class="teks"></td>
                </tr>
                <tr>
                    <th>Qty</th>
                    <td>:</td>
                    <td><input type="text" name="qty" class="teks"></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td><input type="submit" name="submit" value="SIMPAN" class="tombol">
                        <input type="reset" name="reset" value="RESET" class="tombol"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
