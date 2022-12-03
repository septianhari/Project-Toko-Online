/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class produk {
    String id_produk,kd_produk,nm_produk,harga_produk,qty,gambar;
    koneksi db = null;
 
    public produk() {
        db = new koneksi();
    }
    
    public String getId_produk() {
        return id_produk;
    }
 
    public void setId_produk(String id_produk) {
        this.id_produk = id_produk;
    }
 
    public String getKd_produk() {
        return kd_produk;
    }
 
    public void setKd_produk(String kd_produk) {
        this.kd_produk = kd_produk;
    }
 
    public String getNm_produk() {
        return nm_produk;
    }
 
    public void setNm_produk(String nm_produk) {
        this.nm_produk = nm_produk;
    }
 
    public String getHarga_produk() {
        return harga_produk;
    }
 
    public void setHarga_produk(String harga_produk) {
        this.harga_produk = harga_produk;
    }
 
    public String getQty() {
        return qty;
    }
 
    public void setQty(String qty) {
        this.qty = qty;
    }
    
    public String getgambar(){
        return gambar;
    }
    public void setgambar(String gambar){
        this.gambar = gambar;
    }
    public List tampil() {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "select * from produk order by kd_produk asc";
            rs = db.ambilData(sql);
 
            while (rs.next()) {
                produk pm = new produk();
                pm.setId_produk(rs.getString("id_produk"));
                pm.setKd_produk(rs.getString("kd_produk"));
                pm.setNm_produk(rs.getString("nm_produk"));
                pm.setHarga_produk(rs.getString("harga_produk"));
                pm.setQty(rs.getString("qty"));
                data.add(pm);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan tampil produk, pada :\n" + a);
        }
        return data;
    }
}
