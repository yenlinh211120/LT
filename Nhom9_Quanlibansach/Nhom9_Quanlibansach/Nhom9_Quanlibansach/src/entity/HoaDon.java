package entity;

public class HoaDon {
	private int maHD;
	private NhanVien maNV;
	private KhachHang maKH;
	private NhanVien tenNV;
	private double tongTien;
	private int ngayLapHD;
	private String diaChi;
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon(int maHD, NhanVien maNV, KhachHang maKH, NhanVien tenNV, double tongTien, int ngayLapHD,
			String diaChi) {
		super();
		this.maHD = maHD;
		this.maNV = maNV;
		this.maKH = maKH;
		this.tenNV = tenNV;
		this.tongTien = tongTien;
		this.ngayLapHD = ngayLapHD;
		this.diaChi = diaChi;
	}
	public int getMaHD() {
		return maHD;
	}
	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}
	public NhanVien getMaNV() {
		return maNV;
	}
	public void setMaNV(NhanVien maNV) {
		this.maNV = maNV;
	}
	public KhachHang getMaKH() {
		return maKH;
	}
	public void setMaKH(KhachHang maKH) {
		this.maKH = maKH;
	}
	public NhanVien getTenNV() {
		return tenNV;
	}
	public void setTenNV(NhanVien tenNV) {
		this.tenNV = tenNV;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public int getNgayLapHD() {
		return ngayLapHD;
	}
	public void setNgayLapHD(int ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", maNV=" + maNV + ", maKH=" + maKH + ", tenNV=" + tenNV + ", tongTien="
				+ tongTien + ", ngayLapHD=" + ngayLapHD + ", diaChi=" + diaChi + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maHD;
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
		HoaDon other = (HoaDon) obj;
		if (maHD != other.maHD)
			return false;
		return true;
	}
	
	

}
