<%-- 
    Document   : login_admin
    Created on : Jun 21, 2019, 3:22:28 AM
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
            padding: 10% 40%;
        }
        .tombol{
             background-color: firebrick;
                color: white;
                font-size: 11pt;
                width: 48%;
                border: none;
                border-radius: 10px;
                padding: 10px 20px;
        }
        .text{
              box-sizing: border-box;
                width: 100%;
                padding: 10px;
                font-size: 11pt;
                margin-bottom: 20px;
        }
        .kotak{
            width: 350px;
            margin: 80px auto;
            padding: 30px 20px;
            opacity: 0.9;
            box-shadow: darkred 0px 0px 15px 6px;  
            border-radius: 10px;
        }
    </style>
    <body>
        <div class="kotak">
             <form method="post" action="login_prosesadmin.jsp">
            <label>Username</label>
            <input type="text" name="admin" class="text"><br>
            <label>Password</label>
            <input type="password" name="password" class="text"><br>
            
                <input type="submit" name="submit" value="Masuk" class="tombol">
                <input type="reset" name="reset" value="Reset" class="tombol">
        </form>
        </div>
       
    </body>
</html>
