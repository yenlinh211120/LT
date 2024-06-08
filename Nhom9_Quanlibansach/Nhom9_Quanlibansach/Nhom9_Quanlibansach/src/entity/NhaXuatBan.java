package entity;

public class NhaXuatBan {
	private int maNhaXuatBan;
	private String tenNhaXuatBan;
	private String diaChi;
	private int soDienThoai;
	public NhaXuatBan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhaXuatBan(int maNhaXuatBan, String tenNhaXuatBan, String diaChi, int soDienThoai) {
		super();
		this.maNhaXuatBan = maNhaXuatBan;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}
	public int getMaNhaXuatBan() {
		return maNhaXuatBan;
	}
	public void setMaNhaXuatBan(int maNhaXuatBan) {
		this.maNhaXuatBan = maNhaXuatBan;
	}
	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}
	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	@Override
	public String toString() {
		return "NhaXuatBan [maNhaXuatBan=" + maNhaXuatBan + ", tenNhaXuatBan=" + tenNhaXuatBan + ", diaChi=" + diaChi
				+ ", soDienThoai=" + soDienThoai + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maNhaXuatBan;
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
		NhaXuatBan other = (NhaXuatBan) obj;
		if (maNhaXuatBan != other.maNhaXuatBan)
			return false;
		return true;
	}
	
	

}
