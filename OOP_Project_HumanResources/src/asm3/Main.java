package asm3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HumanResources hr = new HumanResources();
		Staff employee = new Employee();
		Staff manager = new Manager();

		// tạo danh sách 3 nhân viên
		hr.staffList.add(new Employee("NV01", "Nguyễn thị Bích", "Ke Toan", "3/1/2019", 25, 10, 3.0, 0));
		hr.staffList.add(new Employee("NV02", "Nguyễn Văn Minh", "San Xuat", "1/3/2022", 23, 6, 2.0, 10.0));
		hr.staffList.add(new Manager("NV03", "Trần Bích Hồng", "5/4/2020", "Maketing", 26, 5, 3.0, "Business Leader"));

		// Tạo danh sách 3 bộ phận
		hr.department.add(new Department("Ke Toan", "KT", 1));
		hr.department.add(new Department("Maketing", "MKT", 1));
		hr.department.add(new Department("San Xuat", "SX", 1));

		Department depa = new Department();
		int luaChon = 0;

		do {
			hr.Menu();
			luaChon = Integer.parseInt(sc.nextLine());	
			switch (luaChon) {
			case 1:
				System.out.println("Bạn muốn thêm nhân viên vào nhóm: \n" + "1.Nhân viên \n" + "2.Quản lí");
				int chonBoPhan = Integer.parseInt(sc.nextLine());
				if (chonBoPhan == 1) {

					Employee nv = new Employee();
					System.out.println("Bạn muốn thêm nhân viên vào bộ phận \n" + "1. Kế Toán \n" + "2. Maketing \n"
							+ "3. Sản Xuất");

					int chon = Integer.parseInt(sc.nextLine());
					switch (chon) {
					case 1:
						nv.boPhan = "Ke Toan";
						depa = hr.department.get(0);
						depa.setSoLuongNV(depa.getSoLuongNV() + 1);
						break;
					case 2:
						nv.boPhan = "Maketing";
						depa = hr.department.get(1);
						depa.setSoLuongNV(depa.getSoLuongNV() + 1);
						break;
					case 3:
						nv.boPhan = "San Xuat";
						depa = hr.department.get(2);
						depa.setSoLuongNV(depa.getSoLuongNV() + 1);
						break;
					}

					System.out.println("Mã Nhân Viên : ");
					nv.maNV = sc.nextLine();
					System.out.println("Tên Nhân Viên : ");
					nv.tenNV = sc.nextLine();
					System.out.println("Ngày vào làm : ");
					nv.ngayVaoLam = sc.nextLine();
					System.out.println("Tuổi :");
					nv.tuoiNV = Integer.parseInt(sc.nextLine());
					System.out.println("Số ngày nghỉ phép :");
					nv.soNgayNghiPhep = Integer.parseInt(sc.nextLine());
					System.out.println("Hệ số lương : ");
					nv.heSL = Double.parseDouble(sc.nextLine());
					System.out.println("Giờ làm thêm :");
					nv.setGioLamThem(Double.parseDouble(sc.nextLine()));
					hr.themNhanVien(nv);

				} else if (chonBoPhan == 2) {
					Manager ql = new Manager();
					System.out.println("Bạn muốn thêm nhân viên vào bộ phận \n" + "1. Kế Toán \n" + "2. Maketing \n"
							+ "3. Sản Xuất");
					int chon = Integer.parseInt(sc.nextLine());

					switch (chon) {
					case 1:
						ql.boPhan = "Ke Toan";
						depa = hr.department.get(0);
						depa.setSoLuongNV(depa.getSoLuongNV() + 1);
						break;
					case 2:
						ql.boPhan = "Maketing";
						depa = hr.department.get(1);
						depa.setSoLuongNV(depa.getSoLuongNV() + 1);
						break;
					case 3:
						ql.boPhan = "San Xuat";
						depa = hr.department.get(2);
						depa.setSoLuongNV(depa.getSoLuongNV() + 1);
						break;
					}

					System.out.println("Mã Nhân Viên : ");
					ql.maNV = sc.nextLine();
					System.out.println("Tên Nhân Viên : ");
					ql.tenNV = sc.nextLine();
					System.out.println("Ngày vào làm : ");
					ql.ngayVaoLam = sc.nextLine();
					System.out.println("Tuổi :");
					ql.tuoiNV = Integer.parseInt(sc.nextLine());
					System.out.println("Số ngày nghỉ phép :");
					ql.soNgayNghiPhep = Integer.parseInt(sc.nextLine());
					System.out.println("Hệ số lương : ");
					ql.heSL = Double.parseDouble(sc.nextLine());
					System.out.println("Chọn chức danh :\n" + "1. Business Leader \n" + "2. Project Leader \n"
							+ "3. Technical Leader");
					int chonChucDanh = Integer.parseInt(sc.nextLine());
					switch (chonChucDanh) {
					case 1:
						ql.setChucDanh("Business Leader");
						break;
					case 2:
						ql.setChucDanh("Project Leader");
						break;
					case 3:
						ql.setChucDanh("Technical Leader");
						break;
					}
					hr.themNhanVien(ql);
				}
				break;
			case 2:
				hr.displayStaff();
				break;
			case 3:
				hr.displayDepartment();
				break;
			case 4:
				hr.displayEmployeeByDepartment();
				break;
			case 5:
				hr.searchByName();
				break;
			case 6:
				System.out.println("Bảng lương của nhân viên");
				System.out.printf("%-10s  %-30s  %-15s", "Mã NV", "Họ tên", "Lương");
				System.out.println();
				hr.showSalary();
				break;
			case 7:
				System.out.println("Bảng lương của nhân viên sắp xếp tăng dần");
				System.out.printf("%-10s  %-30s  %-15s", "Mã NV", "Họ tên", "Lương");
				System.out.println();
				hr.sortSalaryUp();
				break;
			}
		} while (luaChon != 0);
	}

}
