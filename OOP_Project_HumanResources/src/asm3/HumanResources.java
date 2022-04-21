package asm3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HumanResources {
	// tạo danh sách mảng chứa nhân viên
	ArrayList<Staff> staffList = new ArrayList<>();
	// tạo danh sách mảng chứa các bộ phận
	ArrayList<Department> department = new ArrayList<>();

	public HumanResources() {
		this.staffList = new ArrayList<Staff>();
		this.department = new ArrayList<Department>();
	}

	public HumanResources(ArrayList<Staff> staffList, ArrayList<Department> department) {
		this.staffList = staffList;
		this.department = department;
	}

	// show Menu
	public void Menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------Menu------------\n" + "   MỜI BẠN CHỌN CHỨC NĂNG\n" + "1. Thêm nhân viên mới \n"
				+ "2. Hiển thị danh sách tất cả nhân viên trong công ty \n" + "3. Hiển thị các bộ phận trong công ty \n"
				+ "4. Hiển thị các nhân viên theo từng bộ phận\n" + "5. Tìm kiếm nhân viên theo tên \n"
				+ "6. Hiển thị bảng lương của nhân viên toàn công ty \n"
				+ "7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần \n" + "0. Thoát");
	}

	// Thêm nhân viên mới vào danh sách NV của công ty
	public void themNhanVien(Staff nv) {
		staffList.add(nv);
	}

	// Hiển thị danh sách nhân viên toàn bộ công ty
	public void displayStaff() {
		for (Staff staff : staffList) {
			staff.displayInformation();
		}
	}

	// Hiển thị các bộ phận của công ty
	public void displayDepartment() {
		for (Department depar : department) {
			System.out.println(depar);
		}
	}

	// Hiển thị nhân viên theo từng bộ phận
	public void displayEmployeeByDepartment() {
		for (Department d : department) {
			System.out.println("Danh sách nhân viên bộ phận " + d.getTenBP() + ":");
			for (Staff staff : staffList) {
				if (staff.boPhan.equals(d.getTenBP())) {
					staff.displayInformation();
				}
			}
		}
	}

	// Tìm kiếm nhân viên theo tên
	public void searchByName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên cần tìm kiếm :");
		String name = sc.nextLine();
		boolean check = false;
		for (Staff staff : staffList) {
			if (staff.tenNV.toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				check = true;
				staff.displayInformation();
			}
		}
		if (check == false) {
			System.out.println("Không tìm thấy nhân viên trong danh sách");
		}
	}

	// Hiển thị lương của tất cả nhân viên
	public void showSalary() {
		for (Staff staff : staffList) {
			staff.displaySalary();
			System.out.println();
		}
	}

	// Hiển thị bảng lương của nhân viên theo thứ tự tăng dần
	public void sortSalaryUp() {
		Collections.sort(staffList, new Comparator<Staff>() {

			@Override
			public int compare(Staff o1, Staff o2) {
				double salary1, salary2;
				// instanceof : check kiểu đối tượng mà tham chiếu o1 đang trỏ đến xem có phải
				// được tạo nên từ class Manager, subclass manager hay class con của manager hay
				// k
				if (o1 instanceof Manager) {
					Manager mn1 = (Manager) o1;
					salary1 = mn1.calculateSalary();
				} else {
					Employee em1 = (Employee) o1;
					salary1 = em1.calculateSalary();
				}
				if (o2 instanceof Employee) {
					Employee em2 = (Employee) o2;
					salary2 = em2.calculateSalary();
				} else {
					Manager mn2 = (Manager) o2;
					salary2 = mn2.calculateSalary();
				}
				return (int) (salary1 - salary2);

			}
		});
		for (Staff staff : staffList) {
			staff.displaySalary();
			System.out.println();
		}
	}
}
