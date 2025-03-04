/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class modelBacSiCaLam {
    private String maBacSi;
    private String ten;
    private String soDienThoai;
    private String chuyenKhoa;
    private int namKinhNghiem;

    public modelBacSiCaLam() {
    }

    public modelBacSiCaLam(String maBacSi, String ten, String soDienThoai, String chuyenKhoa, int namKinhNghiem) {
        this.maBacSi = maBacSi;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
        this.chuyenKhoa = chuyenKhoa;
        this.namKinhNghiem = namKinhNghiem;
    }

    public String getMaBacSi() {
        return maBacSi;
    }

    public void setMaBacSi(String maBacSi) {
        this.maBacSi = maBacSi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getChuyenKhoa() {
        return chuyenKhoa;
    }

    public void setChuyenKhoa(String chuyenKhoa) {
        this.chuyenKhoa = chuyenKhoa;
    }

    public int getNamKinhNghiem() {
        return namKinhNghiem;
    }

    public void setNamKinhNghiem(int namKinhNghiem) {
        this.namKinhNghiem = namKinhNghiem;
    }
    
    public Object[] toDataRow(){
        return new Object[]{
            this.getMaBacSi(),
            this.getTen(),
            this.getSoDienThoai(),
            this.getChuyenKhoa(),
            this.getNamKinhNghiem()
        };
    }
    
}
