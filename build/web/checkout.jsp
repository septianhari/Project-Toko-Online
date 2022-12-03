<%-- 
    Document   : checkout
    Created on : Jun 17, 2019, 5:53:38 AM
    Author     : upi mariani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <script>
         function rekening(){
             var seleksi = document.data.pilihan.value;
             if(seleksi=="BRI"){
                 document.data.pilih_pembayaran.value="BRI";
                 document.data.rek.value="09873291738";
             }
             if(seleksi=="BNI"){
                 document.data.pilih_pembayaran.value="BNI";
                 document.data.rek.value="0563322211";
             }
             if(seleksi=="COD"){
                 document.data.pilih_pembayaran.value="COD";
                 document.data.rek.value="-";
             }
             if(seleksi=="Alfamart"){
                 document.data.pilih_pembayaran.value="Alfamart";
                 document.data.rek.value="kunjungi alfamart terdekat";
             }
             if(seleksi=="Indomaret"){
                 document.data.pilih_pembayaran.value="Indomaret";
                 document.data.rek.value="kunjungi indomaret terdekat";
             }
         }
        function hitung(){
                var tempat = document.data.kawasan.value;
		if (tempat=="Barat") {                  
                        document.data.tempat.value="Kuningan Barat";
                        document.data.ongkir.value="5000";
                        var a = parseInt(document.data.harga.value);
                        document.data.total.value=5000+a;       
		}
                if (tempat=="Timur") {                  
                        document.data.tempat.value="Kuningan Timur";
                        document.data.ongkir.value="3500";
                        var b = parseInt(document.data.harga.value);
                        document.data.total.value=3500+b;       
		}
                if (tempat=="Selatan") {                  
                        document.data.tempat.value="Kuningan Selatan";
                        document.data.ongkir.value="4000";
                        var c = parseInt(document.data.harga.value);
                        document.data.total.value=4000+c;       
		}
                if (tempat=="Utara") {                  
                        document.data.tempat.value="Kuningan Utara";
                        document.data.ongkir.value="4500";
                        var d = parseInt(document.data.harga.value);
                        document.data.total.value=4500+d;       
		}
		
        }
    </script>
    <style>
        body{
            padding: 5% 45%;
            box-shadow:  indianred 0px 0px 10px 6px;
        }
        .buat{
            width: 100%;
            background-color: darkred;
            color: white;
            padding: 10px 5px;
            border-radius: 10px;
            letter-spacing: 5px;
        }
        .klik{
            width: 100%;
            background-color: indianred;
            border-radius: 10px;
            color: white;
        }
        h1{
            color: darkred;
        }
        .label{
            color: firebrick;
        }
    </style>
    <body>
        <h1>Transaksi Atas Nama</h1>
       <form name="data" method="POST" action="transaksi.jsp">
             <table align="center">
                    <tr>
                        <td class="label">Nama</td>
                        <td>:</td>
                        <td><input type="text" name="nm" placeholder="---isi nama anda---"></td>
                    </tr>
                    <tr>
                        <td class="label">No.Hp</td>
                        <td>:</td>
                        <td><input type="text" name="hp" placeholder="---isi no hp anda---"></td>
                    </tr>
                    <tr>
                        <td class="label">Alamat</td>
                        <td>:</td>
                        <td><input type="text" name="almt" placeholder="---isi alamat anda---" align="center"></td>
                    </tr>
                <tr>
                    <td class="label"><label>Pembayaran</label></td>
                    <td>:</td>
                    <td>
                        <select name="pilihan">
                            <option>Pilih Pembayaran Via</option>
                            <option>BRI</option>
                            <option>BNI</option>
                            <option>COD</option>
                            <option>Alfamart</option>
                            <option>Indomaret</option>
                        </select>
                        <input type="button" value="Via" onclick="rekening()" class="klik">
                    </td>
                </tr>
                <tr>
                    <td class="label">Via Pembayaran</td>
                    <td>:</td>
                    <td><input type="text" name="pilih_pembayaran"></td>
		</tr>
                <tr>
                    <td class="label">No Rekening</td>
                    <td>:</td>
                    <td><input type="text" name="rek"</td>
                </tr>
                <tr>
                    <td class="label">Tempat Pengiriman</td>
                    <td>:</td>
                    <td><select  name="kawasan">
                            <option>Pilih Kawasan Kuningan</option>
                            <option>Barat</option>
                            <option>Timur</option>
                            <option>Selatan</option>
                            <option>Utara</option>
                        </select>
                        <input type="button" name="proses" value="Proses" onclick="hitung()" class="klik">
                    </td>
                </tr>
                <tr>
                    <td class="label">Kawasan Pengiriman</td>
                    <td>:</td>
                    <td><input type="text" name="tempat"</td>
                </tr>
		<tr>
                    <td class="label">Harga Beli</td>
                    <td>:Rp.</td>
                    <td><input type="text" name="harga" value="${cart.orderTotal}"></td>
		</tr>
                <tr>
                    <td class="label">Biaya Pengiriman</td>
                    <td>:Rp.</td>
                    <td><input type="text" name="ongkir"></td>
		</tr>
		<tr>
                    <td class="label">Total Harga</td>
                    <td>:Rp.</td>
                    <td><input type="text" name="total"></td>
		</tr>
		<br>
                <tr>
                    <td>==================================</td>
                </tr>
                <tr>
                    <td><input type="submit" value="Buat Pesanan" class="buat"></td>
                </tr>
            </table>
            
              
        </form>
            
    </body>
</html>
