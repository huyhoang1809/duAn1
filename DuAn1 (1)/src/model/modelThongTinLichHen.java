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
public class modelThongTinLichHen {
    private String maLichHen;
    private String maBenhNhan;
    private String tenBenhNhan;
    private String ngayTao;
    private String ngayKham;
    private boolean gioKham;
    private String tenBacSi;
    private boolean trangThai;
    private String ghiChu;

    public modelThongTinLichHen() {
    }

    public modelThongTinLichHen(String maLichHen, String maBenhNhan, String tenBenhNhan, String ngayTao, String ngayKham, boolean gioKham, String tenBacSi, boolean trangThai, String ghiChu) {
        this.maLichHen = maLichHen;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayTao = ngayTao;
        this.ngayKham = ngayKham;
        this.gioKham = gioKham;
        this.tenBacSi = tenBacSi;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

    public String getMaLichHen() {
        return maLichHen;
    }

    public void setMaLichHen(String maLichHen) {
        this.maLichHen = maLichHen;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayKham() {
        return ngayKham;
    }

    public void setNgayKham(String ngayKham) {
        this.ngayKham = ngayKham;
    }

    public boolean isGioKham() {
        return gioKham;
    }

    public void setGioKham(boolean gioKham) {
        this.gioKham = gioKham;
    }

    public String getTenBacSi() {
        return tenBacSi;
    }

    public void setTenBacSi(String tenBacSi) {
        this.tenBacSi = tenBacSi;
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
            this.getMaLichHen(),
            this.getMaBenhNhan(),
            this.getTenBenhNhan(),
            this.getNgayTao(),
            this.getNgayKham(),
            this.isGioKham()?"Ca sáng":"Ca chiều",
            this.getTenBacSi(),
            this.isTrangThai()?"Đã thanh toán":"Chưa thanh toán",
            this.getGhiChu()
        };
    }
}
