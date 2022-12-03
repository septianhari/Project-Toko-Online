<%-- 
    Document   : editbarang
    Created on : Jul 2, 2019, 3:24:49 AM
    Author     : upi mariani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <% String id = request.getParameter("kode");%>
        <form action="queryedit.jsp" method="POST">
            <table>
                <tbody>
                    <tr>
                        <td><input type="hidden" name="idproduk" value="<%=id%>" /></td>
                    </tr>
                    <tr>
                        <td>Kode Produk</td>
                        <td>:</td>
                        <td><input type="text" name="kodeproduk"/></td>
                    </tr>
                    <tr>
                        <td>Nama Produk</td>
                        <td>:</td>
                        <td><input type="text" name="namaproduk"/></td>
                    </tr>
                    <tr>
                        <td>Harga Produk</td>
                        <td>:</td>
                        <td><input type="text" name="hargaproduk"/></td>
                    </tr>
                    <tr>
                        <td>Quantity</td>
                        <td>:</td>
                        <td><input type="text" name="qtyproduk"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="submit" value="Edit">
                            <input type="reset" name="reset" value="Reset"></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
