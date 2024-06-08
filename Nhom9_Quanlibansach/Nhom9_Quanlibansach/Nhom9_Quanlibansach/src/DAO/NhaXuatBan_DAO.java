package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ConnetDB.connectDB;
import entity.NhaXuatBan;

public class NhaXuatBan_DAO {
	ArrayList<NhaXuatBan> dsnxb;
	NhaXuatBan nxb;
	public NhaXuatBan_DAO(){
		dsnxb=new ArrayList<NhaXuatBan>();
		nxb=new NhaXuatBan();
	}
	public ArrayList<NhaXuatBan> getallNhaXuatBan(){
		ArrayList<NhaXuatBan> danhsachnhaxuatban=new ArrayList<NhaXuatBan>();
		try {
			connectDB.getInstance();
			Connection con=connectDB.getconnection();
			
		String sql="select * from NhaXuatBan";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			String manxb=rs.getString(1);
			//SQL
			NhaXuatBan nxb=new NhaXuatBan(0, sql, manxb, 0);
					danhsachnhaxuatban.add(nxb);
		}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return danhsachnhaxuatban;
	}
	public boolean addNhaXuatBan(NhaXuatBan nxb) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("insert into hoadon values (?.?.?.?.?)");
			stmt.setString(1,nxb.getDiaChi());
			//-------------------------------them cho du thuoc tinh
			n=stmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			return n<0;
		}
		return n>0;
	}
	public boolean deleteNhaXuatBan(String maNXB) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("delete from NhaXuatBan where manxb=?");
			stmt.setString(1, maNXB);
			//-------------------------- cho SQL
			n=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return n>0;
	}
	public boolean updateNhaXuatBan(NhaXuatBan nxb) {
		connectDB.getInstance();
		Connection con=connectDB.getconnection();
		PreparedStatement stmt=null;
		int n=0;
		try {
			stmt=con.prepareStatement("update nhaxuatban set manhaxuatban=?----------------------------where manxb=?");
			stmt.setString(1,nxb.getDiaChi());
			//-------------------------- cho SQL
			n=stmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return n>0;
	}


}
