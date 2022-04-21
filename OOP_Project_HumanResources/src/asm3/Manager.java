package asm3;

public class Manager extends Staff implements ICalculator {
	private String chucDanh;

	public Manager() {
	}

	public Manager(String maNV, String tenNV, String ngayVaoLam, String boPhan, int tuoiNV, int soNgayNghiPhep,
			double heSoLuong, String chucDanh) {
		super(maNV, tenNV, ngayVaoLam, boPhan, tuoiNV, soNgayNghiPhep, heSoLuong);
		this.chucDanh = chucDanh;
	}

	public String getChucDanh() {
		return chucDanh;
	}

	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;
	}

	@Override
	public void displayInformation() {
		System.out.println("Mã nhân viên: " + maNV);
		System.out.println("Tên nhân viên: " + tenNV);
		System.out.println("Bộ phận: " + boPhan);
		System.out.println("Tuổi: " + tuoiNV);
		System.out.println("Ngày vào làm: " + ngayVaoLam);
		System.out.println("Số ngày nghỉ phép: " + soNgayNghiPhep);
		System.out.println("Hệ số lương: " + heSL);
		System.out.println("Chức danh: " + chucDanh);
		System.out.println("----------------------------");
	}
	
	public void displaySalary() {
		System.out.printf("%-10s | %-30s | %.0f", maNV, tenNV , calculateSalary());
	}
	@Override
	public double calculateSalary() {
		double salary = 0;
		if(chucDanh == "Business Leader") {
		    salary = heSL * 5000000 + 8000000 ;
		} else if( chucDanh == "Project Leader") {
			salary = heSL * 5000000 + 5000000;
		} else if( chucDanh == "Technical Leader") {
			salary = heSL * 5000000 + 6000000;
		}
		return salary;
	}
}
