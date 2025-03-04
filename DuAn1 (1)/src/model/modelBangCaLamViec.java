/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class modelBangCaLamViec {
    private String maCaLam;
    private String maBacSi;
    private String ngayLam;
    private boolean caLam;
    private String ghiChu;
    private boolean trangThai;

    public modelBangCaLamViec() {
    }

    public modelBangCaLamViec(String maCaLam, String maBacSi, String ngayLam, boolean caLam, String ghiChu, boolean trangThai) {
        this.maCaLam = maCaLam;
        this.maBacSi = maBacSi;
        this.ngayLam = ngayLam;
        this.caLam = caLam;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public String getMaCaLam() {
        return maCaLam;
    }

    public void setMaCaLam(String maCaLam) {
        this.maCaLam = maCaLam;
    }

    public String getMaBacSi() {
        return maBacSi;
    }

    public void setMaBacSi(String maBacSi) {
        this.maBacSi = maBacSi;
    }

    public String getNgayLam() {
        return ngayLam;
    }

    public void setNgayLam(String ngayLam) {
        this.ngayLam = ngayLam;
    }

    public boolean isCaLam() {
        return caLam;
    }

    public void setCaLam(boolean caLam) {
        this.caLam = caLam;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    public Object[] toDataRow(){
        return new Object[]{
            this.getMaCaLam(),
            this.getMaBacSi(),
            this.getNgayLam(),
            this.isCaLam()?"Ca Sáng":"Ca Chiều",
            this.getGhiChu(),
            this.isTrangThai()?"Chưa có lịch":"Đã có lịch"
        };
    }
}
