package entity;

public class Sach extends SanPham{
	private int maSach;
	private String tenSach;
	private String tacGia;
	private NhaXuatBan maNhaXuatBan;
	private String loaiSach;
	private String namXuatBan;
	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sach(int maSanPham, String tenSanPham, float donGia, int soLuong, NhaSanXuat maNhaSX, float giaNhap,
			float giaBan, String loaiSanPham, double thanhTien) {
		super(maSanPham, tenSanPham, donGia, soLuong, maNhaSX, giaNhap, giaBan, loaiSanPham, thanhTien);
		// TODO Auto-generated constructor stub
	}
	public Sach(int maSach, String tenSach, String tacGia, NhaXuatBan maNhaXuatBan, String loaiSach,
			String namXuatBan) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.maNhaXuatBan = maNhaXuatBan;
		this.loaiSach = loaiSach;
		this.namXuatBan = namXuatBan;
	}
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public NhaXuatBan getMaNhaXuatBan() {
		return maNhaXuatBan;
	}
	public void setMaNhaXuatBan(NhaXuatBan maNhaXuatBan) {
		this.maNhaXuatBan = maNhaXuatBan;
	}
	public String getLoaiSach() {
		return loaiSach;
	}
	public void setLoaiSach(String loaiSach) {
		this.loaiSach = loaiSach;
	}
	public String getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(String namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", tenSach=" + tenSach + ", tacGia=" + tacGia + ", maNhaXuatBan="
				+ maNhaXuatBan + ", loaiSach=" + loaiSach + ", namXuatBan=" + namXuatBan + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + maSach;
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
		Sach other = (Sach) obj;
		if (maSach != other.maSach)
			return false;
		return true;
	}
	
	
	

}
