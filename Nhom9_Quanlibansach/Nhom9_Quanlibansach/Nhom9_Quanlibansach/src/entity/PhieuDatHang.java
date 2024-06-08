package entity;

public class PhieuDatHang {
	private int maDatHang;
	private int ngayDatHang;
	private KhachHang maKH;
	private String trangThai;
	private KhachHang tenKH;
	private KhachHang soDienThoai;
	private KhachHang diaChi;
	private HoaDon maHD;
	private HoaDon tongTien;
	public PhieuDatHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhieuDatHang(int maDatHang, int ngayDatHang, KhachHang maKH, String trangThai, KhachHang tenKH,
			KhachHang soDienThoai, KhachHang diaChi, HoaDon maHD, HoaDon tongTien) {
		super();
		this.maDatHang = maDatHang;
		this.ngayDatHang = ngayDatHang;
		this.maKH = maKH;
		this.trangThai = trangThai;
		this.tenKH = tenKH;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.maHD = maHD;
		this.tongTien = tongTien;
	}
	public int getMaDatHang() {
		return maDatHang;
	}
	public void setMaDatHang(int maDatHang) {
		this.maDatHang = maDatHang;
	}
	public int getNgayDatHang() {
		return ngayDatHang;
	}
	public void setNgayDatHang(int ngayDatHang) {
		this.ngayDatHang = ngayDatHang;
	}
	public KhachHang getMaKH() {
		return maKH;
	}
	public void setMaKH(KhachHang maKH) {
		this.maKH = maKH;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public KhachHang getTenKH() {
		return tenKH;
	}
	public void setTenKH(KhachHang tenKH) {
		this.tenKH = tenKH;
	}
	public KhachHang getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(KhachHang soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public KhachHang getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(KhachHang diaChi) {
		this.diaChi = diaChi;
	}
	public HoaDon getMaHD() {
		return maHD;
	}
	public void setMaHD(HoaDon maHD) {
		this.maHD = maHD;
	}
	public HoaDon getTongTien() {
		return tongTien;
	}
	public void setTongTien(HoaDon tongTien) {
		this.tongTien = tongTien;
	}
	@Override
	public String toString() {
		return "PhieuDatHang [maDatHang=" + maDatHang + ", ngayDatHang=" + ngayDatHang + ", maKH=" + maKH
				+ ", trangThai=" + trangThai + ", tenKH=" + tenKH + ", soDienThoai=" + soDienThoai + ", diaChi="
				+ diaChi + ", maHD=" + maHD + ", tongTien=" + tongTien + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maDatHang;
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
		PhieuDatHang other = (PhieuDatHang) obj;
		if (maDatHang != other.maDatHang)
			return false;
		return true;
	}
	
}
