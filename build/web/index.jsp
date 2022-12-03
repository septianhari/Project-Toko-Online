<%-- 
    Document   : index
    Created on : May 12, 2019, 5:13:30 PM
    Author     : SEMAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halaman Login | Toko Online kami</title>
        <link rel="stylesheet" type="text/css" href="css/csslogin.css.jsp">
    </head>
        <style>
     body{
	font-family: sans-serif;
	background-color: #ccebff;
        }
        .tulisan_login{
                text-align: center;
                text-transform: uppercase;
        }
        .kotak_login{
                width: 350px;
                background-color: white;
                margin: 80px auto;
                padding: 30px 20px;
                opacity: 0.9;
                box-shadow: 0px 0px 20px 6px;  
                border-radius: 10px;
        }
        label{
                font-size: 11pt;
        }

        .form_login{
                box-sizing: border-box;
                width: 100%;
                padding: 10px;
                font-size: 11pt;
                margin-bottom: 20px;
        }
        .form_login:hover{
            background-color: firebrick;
            outline-style: none; 
        }
        .form_login:focus{
            background-color: lightcoral;
        }
        .tombol_login{
                background-color: firebrick;
                color: white;
                font-size: 11pt;
                width: 48%;
                border: none;
                border-radius: 10px;
                padding: 10px 20px;
                
              
        }
        .tombol_login:hover{
            background-color: indianred;
        }
        a{
            text-decoration: none;
            color: black;
            letter-spacing: 3px;
            font-size: 10pt;
        }
        a:hover{
            color: darkred;
            text-decoration: underline;
        }
    </style>

       
    <body>
	<div class="kotak_login">
            <p class="tulisan_login">Silakan isi akun anda</p>
		<form method="POST" action="login.jsp">
			<label>Username</label>
			<input type="text" name="username" class="form_login" placeholder="Username ...">

			<label>Password</label>
                        <input type="password" name="password" class="form_login" placeholder="Password...">

                        <input type="submit" class="tombol_login" value="Login"/>
                        <input type="reset" class="tombol_login" value="Reset" />
			<center>
                            
                            <a href="registreasi.jsp">Belum punya akun?Daftar disini</a>
			</center>
		</form>
	</div>
    </body>
</html>
