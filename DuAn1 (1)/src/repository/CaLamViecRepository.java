/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.*;
import java.util.ArrayList;
import model.modelBacSiCaLam;
import model.modelBangCaLamViec;
import util.DBconnect11111;

public class CaLamViecRepository {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<modelBacSiCaLam> getAllBacSiCaLam(String chuyenKhoa) {
        sql = "select Id_bac_si,Ten,So_dien_thoai,Chuyen_khoa,So_nam_kinh_nghiem from BacSi\n"
                + "where Chuyen_khoa like ?";
        ArrayList<modelBacSiCaLam> listBS = new ArrayList<>();

        try {
            con = DBconnect11111.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, '%' + chuyenKhoa + '%');
            rs = ps.executeQuery();

            while (rs.next()) {
                String maBacSi = rs.getString(1);
                String ten = rs.getString(2);
                String sdt = rs.getString(3);
                String chuyenKhoa1 = rs.getString(4);
                int soNamKinhNghiem = rs.getInt(5);
                listBS.add(new modelBacSiCaLam(maBacSi, ten, sdt, chuyenKhoa1, soNamKinhNghiem));
            }
            return listBS;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<modelBangCaLamViec> getAllBangCaLamViec() {
        sql = "select id_ca_lam_viec,id_bac_si,ngay_lam,ca_lam,ghi_chu,trang_thai from calamviec";
        ArrayList<modelBangCaLamViec> listCL = new ArrayList<>();
        try {
            con = DBconnect11111.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String maCaLam = rs.getString(1);
                String bacSi = rs.getString(2);
                String ngayLam = rs.getString(3);
                boolean caLam = rs.getBoolean(4);
                String ghiChu = rs.getString(5);
                boolean trangThai = rs.getBoolean(6);
                listCL.add(new modelBangCaLamViec(maCaLam, bacSi, ngayLam, caLam, ghiChu, trangThai));
            }
            return listCL;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int them(modelBangCaLamViec b){
        sql="insert into CaLamViec (Id_ca_lam_viec, Id_bac_si,Ngay_lam,Ca_lam,Ghi_chu,Trang_thai) values (?,?,?,?,?,?) ";
        try {
            con=DBconnect11111.getConnection();
            ps=con.prepareStatement(sql);
            ps.setObject(1, b.getMaCaLam());
            ps.setObject(2, b.getMaBacSi());
            ps.setObject(3, b.getNgayLam());
            ps.setObject(4, b.isCaLam());
            ps.setObject(5, b.getGhiChu());
            ps.setObject(6, b.isTrangThai());
            return ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
//    public boolean checkNgay(String ngayLam){
//        sql="select ngay_lam from caLamViec where nga";
//    }
    
    

}
