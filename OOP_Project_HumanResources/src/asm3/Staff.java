package asm3;

public abstract class Staff {
	protected String maNV, tenNV, ngayVaoLam, boPhan;
	protected int tuoiNV, soNgayNghiPhep;
	protected double heSL;

	public Staff() {
	}

	public Staff(String maNV, String tenNV, String ngayVaoLam, String boPhan, int tuoiNV, int soNgayNghiPhep,
			double heSL) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.ngayVaoLam = ngayVaoLam;
		this.boPhan = boPhan;
		this.tuoiNV = tuoiNV;
		this.soNgayNghiPhep = soNgayNghiPhep;
		this.heSL = heSL;
	}
	
	public  abstract void displayInformation();
	public abstract void displaySalary();

}
