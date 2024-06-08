package entity;

public class ChiTietHoaDon {
	private int maCTHD;
	private HoaDon maHD;
	private SanPham tenSanPham;
	private SanPham soLuong;
	private SanPham giaBan;
	private SanPham thanhTien;
	public ChiTietHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietHoaDon(int maCTHD, HoaDon maHD, SanPham tenSanPham, SanPham soLuong, SanPham giaBan,
			SanPham thanhTien) {
		super();
		this.maCTHD = maCTHD;
		this.maHD = maHD;
		this.tenSanPham = tenSanPham;
		this.soLuong = soLuong;
		this.giaBan = giaBan;
		this.thanhTien = thanhTien;
	}
	public int getMaCTHD() {
		return maCTHD;
	}
	public void setMaCTHD(int maCTHD) {
		this.maCTHD = maCTHD;
	}
	public HoaDon getMaHD() {
		return maHD;
	}
	public void setMaHD(HoaDon maHD) {
		this.maHD = maHD;
	}
	public SanPham getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(SanPham tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public SanPham getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(SanPham soLuong) {
		this.soLuong = soLuong;
	}
	public SanPham getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(SanPham giaBan) {
		this.giaBan = giaBan;
	}
	public SanPham getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(SanPham thanhTien) {
		this.thanhTien = thanhTien;
	}
	@Override
	public String toString() {
		return "ChiTietHoaDon [maCTHD=" + maCTHD + ", maHD=" + maHD + ", tenSanPham=" + tenSanPham + ", soLuong="
				+ soLuong + ", giaBan=" + giaBan + ", thanhTien=" + thanhTien + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maCTHD;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietHoaDon other = (ChiTietHoaDon) obj;
		if (maCTHD != other.maCTHD)
			return false;
		return true;
	}
	
	
}
