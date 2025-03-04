/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class modelCaLamViec {
   private String maCaLamViec;
   private String tenBacSi;
   private String ngayLam;
   private boolean gioLam;
   private boolean trangThai;

    public modelCaLamViec() {
    }

    public modelCaLamViec(String maCaLamViec, String tenBacSi, String ngayLam, boolean gioLam, boolean trangThai) {
        this.maCaLamViec = maCaLamViec;
        this.tenBacSi = tenBacSi;
        this.ngayLam = ngayLam;
        this.gioLam = gioLam;
        this.trangThai = trangThai;
    }

    public String getMaCaLamViec() {
        return maCaLamViec;
    }

    public void setMaCaLamViec(String maCaLamViec) {
        this.maCaLamViec = maCaLamViec;
    }

    public String getTenBacSi() {
        return tenBacSi;
    }

    public void setTenBacSi(String tenBacSi) {
        this.tenBacSi = tenBacSi;
    }

    public String getNgayLam() {
        return ngayLam;
    }

    public void setNgayLam(String ngayLam) {
        this.ngayLam = ngayLam;
    }

    public boolean isGioLam() {
        return gioLam;
    }

    public void setGioLam(boolean gioLam) {
        this.gioLam = gioLam;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
   
    
   public Object[] toDataRow(){
       return new Object[]{
           this.getMaCaLamViec(),
           this.getTenBacSi(),
           this.getNgayLam(),
           this.isGioLam()?"Ca sáng":"Ca chiều",
           this.isTrangThai()?"Chưa có lịch":"Đã có lịch"
       };
   }
}
