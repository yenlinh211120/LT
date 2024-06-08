package entity;

public class SanPham {
	private int maSanPham;
	private String tenSanPham;
	private float donGia;
	private int soLuong;
	private NhaSanXuat maNhaSX;
	private float giaNhap;
	private float giaBan;
	private String loaiSanPham;
	private double thanhTien;
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanPham(int maSanPham, String tenSanPham, float donGia, int soLuong, NhaSanXuat maNhaSX, float giaNhap,
			float giaBan, String loaiSanPham, double thanhTien) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.maNhaSX = maNhaSX;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.loaiSanPham = loaiSanPham;
		this.thanhTien = thanhTien;
	}
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public NhaSanXuat getMaNhaSX() {
		return maNhaSX;
	}
	public void setMaNhaSX(NhaSanXuat maNhaSX) {
		this.maNhaSX = maNhaSX;
	}
	public float getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(float giaNhap) {
		this.giaNhap = giaNhap;
	}
	public float getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}
	public String getLoaiSanPham() {
		return loaiSanPham;
	}
	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}
	public double getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", donGia=" + donGia + ", soLuong="
				+ soLuong + ", maNhaSX=" + maNhaSX + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", loaiSanPham="
				+ loaiSanPham + ", thanhTien=" + thanhTien + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maSanPham;
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
		SanPham other = (SanPham) obj;
		if (maSanPham != other.maSanPham)
			return false;
		return true;
	}
	
	
	
	

}
