package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ConnetDB.connectDB;
import entity.KhachHang;

public class KhachHang_DAO {
	ArrayList<KhachHang> dskh;
	KhachHang kh;
	public KhachHang_DAO(){
		dskh=new ArrayList<KhachHang>();
		kh=new KhachHang();
	}
	public ArrayList<KhachHang> getallKhachHang(){
		ArrayList<KhachHang> danhsachkh=new ArrayList<KhachHang>();
		try {
			connectDB.getInstance();
			Connection con=connectDB.getconnection();
			
		String sql="select * from KhachHang";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			String makh=rs.getString(1);
			KhachHang kh=new KhachHang(0, sql, 0, makh);
					danhsachkh.add(kh);
		}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return danhsachkh;
	}
	public boolean addKhachHang(KhachHang kh) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("insert into KhachHang values (?.?.?.?.?)");
			stmt.setString(1,kh.getTenKH());
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
