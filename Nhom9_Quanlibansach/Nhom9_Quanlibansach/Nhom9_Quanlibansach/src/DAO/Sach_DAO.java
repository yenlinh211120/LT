package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ConnetDB.connectDB;
import entity.KhachHang;
import entity.NhaXuatBan;
import entity.Sach;

public class Sach_DAO {
	ArrayList<Sach> dssach;
	Sach sach;
	public Sach_DAO(){
		dssach=new ArrayList<Sach>();
		sach=new Sach();
	}
	public ArrayList<Sach> getallSach(){
		ArrayList<Sach> danhsachsach=new ArrayList<Sach>();
		try {
			connectDB.getInstance();
			Connection con=connectDB.getconnection();
			
		String sql="select * from Sach";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			int masach=rs.getInt(0);
			String tensach=rs.getString(1);
			String tacgia=rs.getString(2);
			String loaisach=rs.getString(3);
			String namxuatban=rs.getString(4);
			String maNhaXuatBan=rs.getString(5);
			
			
			Sach sach=new Sach(masach, tensach, tacgia, null, loaisach, namxuatban);
					danhsachsach.add(sach);
		}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return danhsachsach;
	}
	public boolean addSach(Sach sach) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("insert into Sach values (?.?.?.?.?.?.?)");
			stmt.setInt(0,sach.getMaSach());
			stmt.setString(1,sach.getTenSach());
			stmt.setString(2,sach.getTacGia());
			stmt.setString(3, sach.getLoaiSach());
			stmt.setString(4,sach.getNamXuatBan());
			stmt.setString(5,sach.getNamXuatBan());
			
			
			//-------------------------------them cho du thuoc tinh
			n=stmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			return n<0;
		}
		return n>0;
	}
	public boolean deleteKhachHang(String makh) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("delete from khachhang where makh=?");
			stmt.setString(1, makh);
			//-------------------------- cho SQL
			n=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return n>0;
	}
	public boolean updateHoaDon(KhachHang kh) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("update khachhang set makhachhang=?----------------------------where makh=?");
			stmt.setString(1,kh.getTenKH());
			//-------------------------- cho SQL
			n=stmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return n>0;
	}


}
