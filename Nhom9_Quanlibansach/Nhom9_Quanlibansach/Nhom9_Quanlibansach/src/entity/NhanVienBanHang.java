package entity;

public class NhanVienBanHang extends NhanVien{
	private int maNVBH;
	private boolean caLam;
	private double luong;
	public NhanVienBanHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVienBanHang(int maNV, String tenNV, int ngaySinh, String gioiTinh) {
		super(maNV, tenNV, ngaySinh, gioiTinh);
		// TODO Auto-generated constructor stub
	}
	public NhanVienBanHang(int maNVBH, boolean caLam, double luong) {
		super();
		this.maNVBH = maNVBH;
		this.caLam = caLam;
		this.luong = luong;
	}
	public int getMaNVBH() {
		return maNVBH;
	}
	public void setMaNVBH(int maNVBH) {
		this.maNVBH = maNVBH;
	}
	public boolean isCaLam() {
		return caLam;
	}
	public void setCaLam(boolean caLam) {
		this.caLam = caLam;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + maNVBH;
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
		NhanVienBanHang other = (NhanVienBanHang) obj;
		if (maNVBH != other.maNVBH)
			return false;
		return true;
	}
	

}
