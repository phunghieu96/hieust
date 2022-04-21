package asm3;

public class Department {
	private String tenBP, maBP;
	private int soLuongNV;

	public Department() {
	}

	public Department(String tenBP, String maBP, int soLuongNV) {
		this.tenBP = tenBP;
		this.maBP = maBP;
		this.soLuongNV = soLuongNV;
	}

	public String getTenBP() {
		return tenBP;
	}

	public void setTenBP(String tenBP) {
		this.tenBP = tenBP;
	}

	public String getMaBP() {
		return maBP;
	}

	public void setMaBP(String maBP) {
		this.maBP = maBP;
	}

	public int getSoLuongNV() {
		return soLuongNV;
	}

	public void setSoLuongNV(int soLuongNV) {
		this.soLuongNV = soLuongNV;
	}

	@Override
	public String toString() {
		return "Tên bộ phận : " + tenBP + "\n" + "Mã bộ phận : " + maBP + "\n" + "Số lượng nhân viên : " + soLuongNV
				+ "\n" + "*****************";
	}

}
