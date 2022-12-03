<%-- 
    Document   : login_prosesadmin
    Created on : Jun 21, 2019, 3:32:42 AM
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
            padding: 20%;
        }
        a{
            color: rosybrown;
            text-decoration: none;
            
        }
        p{
            color: #cd4c77;
            letter-spacing: 12px;
            
        }
        h3{
            text-align: center;
            background-image: linear-gradient(to bottom, #f1adad, #eabebe, #ffe2e2);
        }
    </style>
    <body>
        <%
            String user = request.getParameter("admin");
            String pass = request.getParameter("password");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprojek","root","");
            Statement st = con.createStatement();
            ResultSet rs;
            rs = st.executeQuery("select * from login_admin where username='"+ user +"' and password='"+pass+"'");
            if(rs.next()){
                response.sendRedirect("tampilan_admin.jsp");
            }
            else{
                out.println("<h3><p>Password Salah!!!</p> <br> <a href='login_admin.jsp'>Silahkan coba lagi???Click me!!</a><h3><hr>");
            }
        %>
        
    </body>
</html>
