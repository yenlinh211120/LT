package entity;

public class ChiTietPhieuDatHang {
	private int maCTPDH;
	private PhieuDatHang maDatHang;
	private SanPham maSanPham;
	private SanPham tenSanPham;
	private SanPham soLuong;
	private SanPham giaBan;
	private SanPham thanhTien;
	public ChiTietPhieuDatHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietPhieuDatHang(int maCTPDH, PhieuDatHang maDatHang, SanPham maSanPham, SanPham tenSanPham,
			SanPham soLuong, SanPham giaBan, SanPham thanhTien) {
		super();
		this.maCTPDH = maCTPDH;
		this.maDatHang = maDatHang;
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.soLuong = soLuong;
		this.giaBan = giaBan;
		this.thanhTien = thanhTien;
	}
	public int getMaCTPDH() {
		return maCTPDH;
	}
	public void setMaCTPDH(int maCTPDH) {
		this.maCTPDH = maCTPDH;
	}
	public PhieuDatHang getMaDatHang() {
		return maDatHang;
	}
	public void setMaDatHang(PhieuDatHang maDatHang) {
		this.maDatHang = maDatHang;
	}
	public SanPham getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(SanPham maSanPham) {
		this.maSanPham = maSanPham;
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
		return "ChiTietPhieuDatHang [maCTPDH=" + maCTPDH + ", maDatHang=" + maDatHang + ", maSanPham=" + maSanPham
				+ ", tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", giaBan=" + giaBan + ", thanhTien="
				+ thanhTien + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maCTPDH;
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
		ChiTietPhieuDatHang other = (ChiTietPhieuDatHang) obj;
		if (maCTPDH != other.maCTPDH)
			return false;
		return true;
	}
	
	

}
