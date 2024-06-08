package entity;

public class NhanVienQuanLi extends NhanVien {
	private int maNVQL;
	private double luongCoBan;
	private double phuCap;
	private double tienThuong;
	public NhanVienQuanLi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVienQuanLi(int maNV, String tenNV, int ngaySinh, String gioiTinh) {
		super(maNV, tenNV, ngaySinh, gioiTinh);
		// TODO Auto-generated constructor stub
	}
	public NhanVienQuanLi(int maNVQL, double luongCoBan, double phuCap, double tienThuong) {
		super();
		this.maNVQL = maNVQL;
		this.luongCoBan = luongCoBan;
		this.phuCap = phuCap;
		this.tienThuong = tienThuong;
	}
	public int getMaNVQL() {
		return maNVQL;
	}
	public void setMaNVQL(int maNVQL) {
		this.maNVQL = maNVQL;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	public double getTienThuong() {
		return tienThuong;
	}
	public void setTienThuong(double tienThuong) {
		this.tienThuong = tienThuong;
	}
	@Override
	public String toString() {
		return "NhanVienQuanLi [maNVQL=" + maNVQL + ", luongCoBan=" + luongCoBan + ", phuCap=" + phuCap
				+ ", tienThuong=" + tienThuong + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + maNVQL;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVienQuanLi other = (NhanVienQuanLi) obj;
		if (maNVQL != other.maNVQL)
			return false;
		return true;
	}
	
	
	
	

}
