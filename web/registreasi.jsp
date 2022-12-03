<%-- 
    Document   : registreasi
    Created on : May 12, 2019, 5:27:01 PM
    Author     : SEMAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <div class="body">
    <style>
        .body{
            background-color:#ccebff;
        }
        .kotak_regristrasi{
                width: 350px;
                background-color: white;
                margin: 80px auto;
                padding: 30px 20px;
                opacity: 0.7;
                box-shadow: 0px 0px 20px 6px;  
                border-radius: 10px;
        }
        .input{
               box-sizing: border-box;
                width: 100%;
                padding: 10px;
                font-size: 11pt;
                margin-bottom: 20px;
        }
        .tombol{
                background-color: darkred;
                color: white;
                font-size: 11pt;
                width: 48%;
                border: none;
                border-radius: 10px;
                padding: 10px 20px;
        }
        .tombol:hover{
            background-color: indianred;
            color: white;
        }
        h2{
            text-align: center;
        }
        .bawah{
            text-align: center;
            
        }
        .bawah a{
            text-decoration: none;
            color: darkred;
        }
        .bawah a:hover{
            background-color: indianred;
            color: white;
        }
    </style>
    <body>
        <div class="kotak_regristrasi">
            <h2>Create your Account</h2>
            <form method="POST" action="prosesreg.jsp">
            
                <label>Username*</label>
                <input type="text" name="username" value="" class="input" placeholder="---username---"/>
                
                <label>Contact*</label>
                <input type="text" name="kontak" value="" class="input" placeholder="---contact---"/>
                
                <label>Alamat*</label>
                <input type="text" name="alamat" value="" class="input" placeholder="---alamat---"/>
                
                <label>Status*</label>
                <select name="status" class="input">
                    <option>---Pilih status---</option>
                         <option>Customer</option>
                         <option>Toko</option>
                </select>
                
                <label>Password*</label>
                <input type="password" name="password" value="" class="input" placeholder="---password---"/>
                
                <label>Email*</label>
                <input type="text" name="email" value="" class="input" placeholder="---email---"/>
                
                <input type="submit" value="Submit" class="tombol"/>
                <input type="reset" value="Reset" class="tombol"/>
      
           
        </form><hr> <h3 class="bawah">Already registered!! <a href="index.jsp">Login Here</a></h3>
    </body>
    </div>
    </div>
</html>
