package assigment5;

<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> 86f8770633e2f4f086edb7cfd8c7be3439e672b5
import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private int phuCap;
	private float luong;
	private float heSoLuong;

	public CanBo() {
	}

	public CanBo(String hoTen, int phuCap, float luong, float heSoLuong) {
		this.hoTen = hoTen;
		this.phuCap = phuCap;
		this.luong = luong;
		this.heSoLuong = heSoLuong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(int phuCap) {
		this.phuCap = phuCap;
	}

	public float getLuong() {
		return luong;
	}

	public void setLuong(float luong) {
		this.luong = luong;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public void nhapHoTen() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhập họ tên");
<<<<<<< HEAD

		while(true) {
			try {
				String hoTen = scn.nextLine();
				MyException.chkHoTen(hoTen);
				this.setHoTen(hoTen);
=======
		String hoTen;
		while (true) {
			try {
				hoTen = scn.nextLine();
				MyException.chkHoTen(hoTen, Main.list);
>>>>>>> 86f8770633e2f4f086edb7cfd8c7be3439e672b5
				break;
			} catch (MyException e) {
				System.err.println(e);
			}
		}
<<<<<<< HEAD
	}

	public void nhapHeSoLuong() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhập hệ số lương");
		float heSoLuong = Float.parseFloat(scn.nextLine());
		this.setHeSoLuong(heSoLuong);
		;
=======
		this.setHoTen(hoTen);
	}

	public void nhapHeSoLuong() {
		float heSoLuong = 0;
		String input;
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhập hệ số lương");
		while (true) {
			try {
				input = scn.nextLine();
				MyException.chkhesoluong(input);
				heSoLuong = Float.parseFloat(input);
				break;
			} catch (MyException e) {
				System.err.println(e);
			}
		}
		this.setHeSoLuong(heSoLuong);
>>>>>>> 86f8770633e2f4f086edb7cfd8c7be3439e672b5
	}
}
