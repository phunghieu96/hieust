package asm3;

public class Employee extends Staff implements ICalculator {
	private double gioLamThem;

	public Employee() {
	}

	public Employee(String maNV, String tenNV, String boPhan, String ngayVaoLam, int tuoiNV, int soNgayNghiPhep,
			double heSoLuong, double gioLamThem) {
		super(maNV, tenNV, ngayVaoLam, boPhan, tuoiNV, soNgayNghiPhep, heSoLuong);
		this.gioLamThem = gioLamThem;
	}

	public double getGioLamThem() {
		return gioLamThem;
	}

	public void setGioLamThem(double gioLamThem) {
		this.gioLamThem = gioLamThem;
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
		System.out.println("Số giờ làm thêm: " + gioLamThem);
		System.out.println("----------------------------");
	}
	
	public void displaySalary() {
		System.out.printf("%-10s | %-30s | %.0f", maNV, tenNV , calculateSalary());
	}
	@Override
	public double calculateSalary() {
		double salary = 0;
		salary = heSL * 3000000 + gioLamThem * 200000;
		return salary;
	}

	
	

}
