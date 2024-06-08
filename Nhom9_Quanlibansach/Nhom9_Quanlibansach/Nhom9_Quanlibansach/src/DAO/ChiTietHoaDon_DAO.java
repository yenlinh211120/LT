package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ConnetDB.connectDB;
import entity.ChiTietHoaDon;


public class ChiTietHoaDon_DAO {

	ArrayList<ChiTietHoaDon> dschitiethd;
	ChiTietHoaDon chitiethd;
	public ChiTietHoaDon_DAO(){
		dschitiethd=new ArrayList<ChiTietHoaDon>();
		chitiethd=new ChiTietHoaDon();
	}
	public ArrayList<ChiTietHoaDon> getChiTietHoaDon(){
		ArrayList<ChiTietHoaDon> danhsachchitiethd=new ArrayList<ChiTietHoaDon>();
		try {
			connectDB.getInstance();
			Connection con=connectDB.getconnection();
			
		String sql="select * from ChiTietHoaDon";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			int masach=rs.getInt(0);
			
			
			
			ChiTietHoaDon chitiethd=new ChiTietHoaDon(masach, null, null, null, null, null);
					danhsachchitiethd.add(chitiethd);
		}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return danhsachchitiethd;
	}
	public boolean addSach(ChiTietHoaDon chitiethd) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("insert into ChiTietHoaDon values (?.?.?.?.?.?.?)");
			stmt.setInt(0,chitiethd.getMaCTHD());
			
			
			
			//-------------------------------them cho du thuoc tinh
			n=stmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			return n<0;
		}
		return n>0;
	}
	public boolean deleteChiTietHoaDon(String macthoadon) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("delete from chitiethoadon where mahd=?");
			stmt.setString(1, macthoadon);
			//-------------------------- cho SQL
			n=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return n>0;
	}
	public boolean updateChiTietHD(ChiTietHoaDon chitiethd) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("update chitiethoadon set mahoadon=?----------------------------where makh=?");
			stmt.setInt(1,chitiethd.getMaCTHD());
			//-------------------------- cho SQL
			n=stmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return n>0;
	}

}
