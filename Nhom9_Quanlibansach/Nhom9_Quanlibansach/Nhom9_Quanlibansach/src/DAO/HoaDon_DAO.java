package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ConnetDB.connectDB;
import entity.HoaDon;

public class HoaDon_DAO {
	ArrayList<HoaDon> dshd;
	HoaDon hd;
	public HoaDon_DAO(){
		dshd=new ArrayList<HoaDon>();
		hd=new HoaDon();
	}
	public ArrayList<HoaDon> getallHoaDon(){
		ArrayList<HoaDon> danhsachhd=new ArrayList<HoaDon>();
		try {
			connectDB.getInstance();
			Connection con=connectDB.getconnection();
			
		String sql="select * from HoaDon";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			String mahd=rs.getString(1);
			HoaDon hd=new HoaDon(0, null, null, null, 0, 0, mahd);
					danhsachhd.add(hd);
		}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return danhsachhd;
	}
	public boolean addHoaDon(HoaDon hd) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("insert into hoadon values (?.?.?.?.?)");
			stmt.setString(1,hd.getDiaChi());
			//-------------------------------them cho du thuoc tinh
			n=stmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			return n<0;
		}
		return n>0;
	}
	public boolean deleteHoaDon(String mahd) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("delete from hoadon where mahd=?");
			stmt.setString(1, mahd);
			//-------------------------- cho SQL
			n=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return n>0;
	}
	public boolean updateHoaDon(HoaDon hd) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("update hoadon set mahoadon=?----------------------------where mahd=?");
			stmt.setString(1,hd.getDiaChi());
			//-------------------------- cho SQL
			n=stmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return n>0;
	}

}
