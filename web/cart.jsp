<%-- 
    Document   : keranjang
    Created on : May 13, 2019, 12:37:56 AM
    Author     : SEMAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halaman Checkout | Toko online kami</title>
    </head>
    <style>
        body{
            padding: 0px 90px;
        }
        header{
            background-color: grey;
            color: black;
            padding : 10px 30px;
            border-radius: 10px;
        }
        h1{
            letter-spacing: 2px;
            text-decoration: bold;
        }
        .tr{
            background-color: lightcoral;
            color: white;
        }
        .tombol{
            width: 30%;
            background-color: firebrick;
            color: white;
            border-radius: 10px;
        }
        .link a{
            text-decoration: none;
            color: darkred;
        }
        .link a:hover{
            color:#cd4c77;
            text-decoration: underline;
        }
    </style>
    
    <body>
        <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
        <header>
            <h1>Keranjang</h1>
        </header>
        
        <form name="item" method="POST" action="kontrol_barang">
            <table width="100%" border="1">
            <tr class="tr">
                <th>Kode Produk</th>
                <th>Nama Produk</th>              
                <th>Quantity</th>
                <th>Harga</th>
                <th>Total</th>                
            </tr>
            <jsp:useBean id="cart" scope="session" class="wadah.Keranjang1" />
            <c:if test="${cart.lineItemCount==0}">
                <tr>
                    <td colspan="5"><font size="2" face="Verdana, Arial, Helvetica, sans-serif">- Barang sudah Masuk Keranjang -<br/></td>
           
                </tr>
            </c:if>
            <c:forEach var="cartItem" items="${cart.cartItems}" varStatus="counter">
                <form name="item" method="POST" action="kontrol_barang">
                    <tr>
                        <td><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><b><c:out value="${cartItem.kd_produk}"/></b><br/></td>
                        <td>  <c:out value="${cartItem.nm_produk}"/></font></td>
                        <td>
                            <input type='hidden' name='itemIndex' value='<c:out value="${counter.count}"/>'>
                            <input type='text' name="qty" value='<c:out value="${cartItem.qty}"/>' size='2'>
                        
                            <input type="submit" name="action" value="Update" class="tombol">
                            <input type="submit" name="action" value="Delete" class="tombol">
                        </td>
                        <td><font size="2" face="Verdana, Arial, Helvetica, sans-serif">Rp. <c:out value="${cartItem.harga}"/></font></td>
                        <td><font size="2" face="Verdana, Arial, Helvetica, sans-serif">Rp. <c:out value="${cartItem.totalHarga}"/></font></td>
                    </tr>
                </form>
            </c:forEach>
            <tr>
                <td colspan="2"> </td>
                <td> </td>
                <td></td>
                <td><font size="2" face="Verdana, Arial, Helvetica, sans-serif">Subtotal: Rp. <c:out value="${cart.orderTotal}"/></font></td>
            </tr>
        </table>
            <p class="link"><a href="sukses.jsp" >Continue Belanja...</a> </p>
            <p class="link"><a href="checkout.jsp" >Checkout...</a></p>
            
        </form>
    </body>
</html>
