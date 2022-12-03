<%-- 
    Document   : tampilan_admin
    Created on : Jul 2, 2019, 1:14:16 PM
    Author     : upi mariani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body{
            padding: 100px 50px;
        }
        header{
            background-image: linear-gradient(to right, darkred, indianred);
            overflow: hidden; /*konten yang berlebihan akan disembunyikan*/
            border-radius: 20px;/*digunakan untuk memberikan lengkungan di setiap pojok box*/
            box-shadow: 2px 3px 5px black;/*memberikan efek shadow pada box class head*/
            opacity: 0.8; /*memberikan efek memperhalus tampilan dengan sedikit blur dengan kapasitas 0.8*/
        }
        ul a{
            padding: 10px 10px;/*jarak antara kata link satu dengan kata link lainnya*/
            display: block; /*menampilkan link tersebut sejajar dengan link lainnya*/
            text-decoration: none; /*tidak memiliki underline*/
            float: left; /*posisi link tersebut di sebelah kanan*/
            font-size: 20px;
            color: white; /*warna tulisan*/
            text-shadow: 2px 3px 5px black; /*efek shadow pada text link*/
        }
        ul a:hover{
            color:lightcoral;
            text-decoration: underline;
        }
        h1{
            color: darkred;
        }
        
    </style>
    <body>
        <h1>Welcome Admin:))</h1><hr>
        <header>
             <ul>
                
                <a href="tampil_transaksi.jsp">Transaksi Masuk</a>
                <a href="tampilbarang.jsp">List Barang</a>
               
             </ul>
        </header>
        
       
    </body>
</html>
