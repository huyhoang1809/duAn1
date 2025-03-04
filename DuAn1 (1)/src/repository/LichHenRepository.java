/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.*;
import java.util.ArrayList;
import model.modelCaLamViec;
import model.modelLichHen;
import model.modelThongTinLichHen;
import model.modelInsertLichHen1;
import util.DBconnect11111;
import view.datLich;
public class LichHenRepository {
    private Connection con= null;
    private PreparedStatement ps= null;
    private ResultSet rs= null;
    private String sql= null;
    
    public ArrayList<modelCaLamViec> getAllCaLamViec(Date ngayLam,boolean  caLam){
        sql="select Id_ca_lam_viec,BacSi.Ten,Ngay_lam,Ca_lam,calamviec.trang_thai from CaLamViec\n" +
"join BacSi on BacSi.Id_bac_si=CaLamViec.Id_bac_si\n" +
"where Ngay_lam=? and Ca_lam=?  and calamviec.trang_thai=1 ";
        ArrayList<modelCaLamViec> listCaLam= new ArrayList<>();
        
        try {
            con=DBconnect11111.getConnection();
            ps=con.prepareStatement(sql);
            ps.setObject(1, ngayLam);
            ps.setObject(2, caLam);
            
            rs=ps.executeQuery();
            
            while (rs.next()) {                
                String maCaLam=rs.getString(1);
                String tenBacSi=rs.getString(2);
                String ngayLam1=rs.getString(3);
                boolean caLam1=rs.getBoolean(4);
                boolean trangThai=rs.getBoolean(5);
                listCaLam.add(new modelCaLamViec(maCaLam, tenBacSi, ngayLam1, caLam, trangThai));
            }
            return listCaLam;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Date ngayKham(String a){
        
        try {
            Date date = Date.valueOf(a);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<modelThongTinLichHen> getAllThongTinLichHen(){
        sql="select Id_lich_hen,BenhNhan.Id_benh_nhan,BenhNhan.Ten,Ngay_tao,\n" +
"CaLamViec.Ngay_lam,CaLamViec.Ca_lam,BacSi.Ten,LichHen.Trang_thai,LichHen.Ghi_chu\n" +
"from LichHen\n" +
"join BenhNhan on BenhNhan.Id_benh_nhan=LichHen.Id_benh_nhan\n" +
"join CaLamViec on CaLamViec.Id_ca_lam_viec=LichHen.Id_ca_lam_viec\n" +
"join BacSi on BacSi.Id_bac_si=CaLamViec.Id_bac_si";
        ArrayList<modelThongTinLichHen> listThongTinLichHen= new ArrayList<>();
        try {
            con=DBconnect11111.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while (rs.next()) {                
                String maLichHen=rs.getString(1);
                String maBenhNhan=rs.getString(2);
                String tenBenhNhan=rs.getString(3);
                String ngayTao=rs.getString(4);
                String ngayKham=rs.getString(5);
                boolean caLam=rs.getBoolean(6);
                String tenBacSi=rs.getString(7);
                boolean trangThai=rs.getBoolean(8);
                String ghiChu=rs.getString(9);
                listThongTinLichHen.add(new modelThongTinLichHen(maLichHen, maBenhNhan, tenBenhNhan, ngayTao, ngayKham, caLam, tenBacSi, trangThai, ghiChu));
            }
            return listThongTinLichHen;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
            
        }
    }
    
    public ArrayList<modelLichHen> getAllLichHen(){
        sql="select BenhNhan.Id_benh_nhan,Ngay_tao,CaLamViec.Id_ca_lam_viec,Trang_thai,LichHen.Ghi_chu\n" +
"from LichHen\n" +
"join BenhNhan on BenhNhan.Id_benh_nhan=LichHen.Id_benh_nhan\n" +
"join CaLamViec on CaLamViec.Id_ca_lam_viec=LichHen.Id_ca_lam_viec";
        ArrayList<modelLichHen> listLichHen= new ArrayList<>();
        try {
            con=DBconnect11111.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while (rs.next()) {  
                
                String maKhachHang=rs.getString(1);
                String ngayTao=rs.getString(2);
                String maCaLam=rs.getString(3);
                Boolean trangThai=rs.getBoolean(4);
                String ghiChu=rs.getString(5);
                listLichHen.add(new modelLichHen(maKhachHang, ngayTao, maCaLam, true, ghiChu));
            }
            return listLichHen;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int them(modelInsertLichHen1 m){
        sql="insert into Lichhen(Id_lich_hen,Id_benh_nhan,Ngay_tao,Id_ca_lam_viec,Trang_thai,Ghi_chu) values(?,?,GETDATE(),?,?,?)";
        try {
            con=DBconnect11111.getConnection();
            ps=con.prepareStatement(sql);
            ps.setObject(1, m.getMaLichHen());
            ps.setObject(2, m.getMaKhachHang());
            ps.setObject(3, m.getMaCaLam());
            ps.setObject(4, m.isTrangThai());
            ps.setObject(5, m.getGhiChu());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
