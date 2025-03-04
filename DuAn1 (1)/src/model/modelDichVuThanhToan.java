/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class modelDichVuThanhToan {
    private String maDV;
    private String tenDV;
    private String moTa;
    private double chiPhi;

    public modelDichVuThanhToan() {
    }

    public modelDichVuThanhToan(String maDV, String tenDV, String moTa, double chiPhi) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.moTa = moTa;
        this.chiPhi = chiPhi;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }
    
    public Object[] toDataRow(){
        return new Object[]{maDV, tenDV, moTa, chiPhi};
    }
}
