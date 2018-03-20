package assigment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		ArrayList<CanBo> list = new ArrayList<CanBo>();
		int control = 5;
		while (control != 0) {
			System.out.println("1.Nhập thông tin danh sách cán bộ trong trường.\r\n"
					+ "2.Xuất danh sách giảng viên khoa x, hoặc nhân viên phòng ban y nào đó.\r\n"
					+ "3.Tổng số lương trường phải trả cho cán bộ.\r\n"
					+ "4.Sắp xếp cán bộ theo lương, nếu lương bằng thì sắp xếp theo tên. ");

			Scanner scan = new Scanner(System.in);
			control = Integer.parseInt(scan.nextLine());

			if (control == 1) {
				int control2 = 5;
				while (control2 != 0) {
					System.out.println("1. Nhập giảng viên");
					System.out.println("2. Nhập nhân viên");
					System.out.println("3. Thoát");
					control2 = Integer.parseInt(scan.nextLine());
					if (control2 == 1) {
						System.out.println("Nhập số lượng giảng viên cần nhập");
						int soluonggiangvien = Integer.parseInt(scan.nextLine());
						for (int i = 0; i < soluonggiangvien; i++) {
							Giangvien gv = new Giangvien();
							gv.nhap();
							list.add(gv);
						}

					} else if (control2 == 2) {
						System.out.println("Nhập số lượng nhân viên cần nhập");
						int soluongnhanvien = Integer.parseInt(scan.nextLine());
						for (int i = 0; i < soluongnhanvien; i++) {
							Nhanvien nv = new Nhanvien();
							nv.nhap();
							list.add(nv);
						}

					} else if (control2 == 3) {
						break;
					}

				}
			} else if (control == 2) {
				for (CanBo cb : list) {
					if (cb instanceof Giangvien) {
						Giangvien gv = (Giangvien) cb;
						gv.xuat();
					}
					if (cb instanceof Nhanvien) {
						Nhanvien nv = (Nhanvien) cb;
						nv.xuat();
					}
				}
			} else if (control == 3) {
				float tongLuong = 0;
				for (CanBo cb : list) {
					tongLuong += cb.getLuong();
				}
				System.out.println("Tổng lương: " + tongLuong);
			} else if (control == 4) {
				System.out.println("Sắp xếp cán bộ theo lương và tên");
				Collections.sort(list, new Comparator<CanBo>() {

					@Override
					public int compare(CanBo o1, CanBo o2) {
						// TODO Auto-generated method stub
						if (o1.getLuong() > o2.getLuong())
							return 1;
						else if (o1.getLuong() == o2.getLuong()) {
							return o1.getHoTen().compareTo(o2.getHoTen());
						} else
							return -1;
					}
				});
			}

		}
	}
}
