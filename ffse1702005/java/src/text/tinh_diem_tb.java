package text;

import java.text.DecimalFormat;
import java.util.Scanner;

public class tinh_diem_tb {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Số học sinh cần nhập: ");
		int n = scanner.nextInt();
		Double[] arr = new Double[n];
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.println("Nhập họ tên của học sinh thứ " + (i + 1));
			String name = scanner.nextLine();

			System.out.println("Nhập ngày sinh của học sinh thứ " + (i + 1));
			int date = scanner.nextInt();

			System.out.println("Nhập tháng sinh của học sinh thứ " + (i + 1));
			int month = scanner.nextInt();

			System.out.println("Nhập năm sinh của học sinh thứ " + (i + 1));
			int year = scanner.nextInt();

			System.out.println("Nhập điểm 1 của học sinh thứ " + (i + 1));
			Double point1 = scanner.nextDouble();

			System.out.println("Nhập điểm 2 của học sinh thứ " + (i + 1));
			Double point2 = scanner.nextDouble();

			System.out.println("STT: " + (i + 1));
			System.out.println("Họ tên: " + name);
			System.out.println("Ngày sinh: " + date + "/" + month + "/" + year);
			System.out.println("Tuổi: " + (2018 - year));
			System.out.println("Điểm #1: " + point1);
			System.out.println("Điểm #2: " + point2);
			Double TB = (point1 + point2) / 2;
			System.out.println("Điểm TB: " + TB);
			arr[i] = TB;
			if (TB <= 49) {
				System.out.println("Loại D");
			} else if (TB >= 50 && TB <= 69) {
				System.out.println("Loại C");
			} else if (TB >= 70 && TB <= 84) {
				System.out.println("Loại B");
			} else if (TB >= 85 && TB <= 100) {
				System.out.println("Loại A");
			}

		}

		for (;;) {
			try {
				System.out.println("");
				System.out.println(">>      SẮP XẾP     <<");
				System.out.println("+--------------------+");
				System.out.println("+|    1. Theo tên   |+");
				System.out.println("+|    2. Theo điểm  |+");
				System.out.println("+|    3. Kết thúc   |+");
				System.out.println("+--------------------+");
				System.out.println("+>> Chọn chức năng <<+");

				Scanner myInput = new Scanner(System.in);
				int answer = myInput.nextInt();

				if (answer == 1) {
					// sắp xếp dãy số theo thứ tự tăng dần

				}

				else if (answer == 2) {
					// sắp xếp dãy số theo thứ tự giảm dần
					sortDSC(arr);
					System.out.println("Điểm TB của học sinh (từ cao đến thấp): ");
					show(arr);
				}

				else if (answer == 3) {
					System.exit(0);
				}

				else {
					System.out
							.println("+>> Nhập sai chức năng vui lòng nhập lại chức năng trong khoảng từ 1 đến 4 <<+");
				}
			} catch (Exception e) {
				System.out.println("+>> Error! Vui lòng nhập lại <<+");
			}
		}

	}

	public static void sortDSC(Double[] arr) {
		Double temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

	}

	public static void show(Double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

}
