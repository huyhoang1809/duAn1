/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.UUID;

/**
 *
 * @author Admin
 */
public class model_lich_henThanhToan {
    private String idLichHen;
    private String idBenhNhan;
    private String tenBenhNhan;
    private String ngayTao;
    private String ngayKham;
    private boolean caKham;
    private String ghiChu;

    public model_lich_henThanhToan() {
    }

    public model_lich_henThanhToan(String idLichHen, String idBenhNhan, String tenBenhNhan, String ngayTao, String ngayKham, boolean caKham, String ghiChu) {
        this.idLichHen = idLichHen;
        this.idBenhNhan = idBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayTao = ngayTao;
        this.ngayKham = ngayKham;
        this.caKham = caKham;
        this.ghiChu = ghiChu;
    }
    
    

    public String getIdLichHen() {
        return idLichHen;
    }

    public void setIdLichHen(String idLichHen) {
        this.idLichHen = idLichHen;
    }

    public String getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(String idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
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

    public boolean isCaKham() {
        return caKham;
    }

    public void setCaKham(boolean caKham) {
        this.caKham = caKham;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    
    
    public Object[] toDataRow(){
        return new Object[]{idLichHen, idBenhNhan, tenBenhNhan, ngayTao, ngayKham, caKham?"Ca Sang" : "Ca chiều", ghiChu};
    }
}
