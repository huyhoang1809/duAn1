/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class modelLichHen {
    
    private String maKhachHang;
    private String ngayTao;
    private String maCaLam;
    private boolean trangThai;
    private String ghiChu;

    public modelLichHen() {
    }

    public modelLichHen(String maKhachHang, String ngayTao, String maCaLam, boolean trangThai, String ghiChu) {
        this.maKhachHang = maKhachHang;
        this.ngayTao = ngayTao;
        this.maCaLam = maCaLam;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMaCaLam() {
        return maCaLam;
    }

    public void setMaCaLam(String maCaLam) {
        this.maCaLam = maCaLam;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    public Object[] toDataRow(){
        return new Object[]{
            this.getMaKhachHang(),
            this.getNgayTao(),
            this.getMaCaLam(),
            this.isTrangThai()?"Đã đến":"Chưa đến",
            this.getGhiChu()
        };
    }
}
