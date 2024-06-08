package entity;

public class NhaSanXuat {
	private int maNhaSX;
	private String nhaSX;
	private String diaChi;
	private int soDienThoai;
	public NhaSanXuat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhaSanXuat(int maNhaSX, String nhaSX, String diaChi, int soDienThoai) {
		super();
		this.maNhaSX = maNhaSX;
		this.nhaSX = nhaSX;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}
	public int getMaNhaSX() {
		return maNhaSX;
	}
	public void setMaNhaSX(int maNhaSX) {
		this.maNhaSX = maNhaSX;
	}
	public String getNhaSX() {
		return nhaSX;
	}
	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
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
		return "NhaSanXuat [maNhaSX=" + maNhaSX + ", nhaSX=" + nhaSX + ", diaChi=" + diaChi + ", soDienThoai="
				+ soDienThoai + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maNhaSX;
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
		NhaSanXuat other = (NhaSanXuat) obj;
		if (maNhaSX != other.maNhaSX)
			return false;
		return true;
	}
	
	

}
