package assignment5;

import java.util.Scanner;

public class NhanVien extends CanBo {
	
	private static final long serialVersionUID = 1L;
	private String phongBan, chucVu;
	private int soNgayCong;
	private Scanner input;
	
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	@Override
	public void nhap() {
		int chon;
		int[] pc = {2000,1000,500};
		String[] cv = {"Trưởng phòng", "Phó phòng", "Nhân viên"};
		super.nhap();
		input = new Scanner(System.in);
		System.out.print("Nhập phòng ban: ");
		phongBan = input.nextLine();
		do {
			System.out.print("Nhập chức vụ (1 - Trưởng phòng, 2- Phó phòng, 3 - Nhân viên): ");
			chon = Main.checkInt();
		} while (chon > 3 || chon == 0);
		chucVu = cv[(chon - 1)];
		this.setPhuCap(pc[(chon - 1)]);
		System.out.print("Nhập số ngày công: ");
		soNgayCong = Main.checkInt();
		this.setLuong(getHeSoLuong() * 730 + getPhuCap() + soNgayCong * 30);
	}
	@Override
	public String toString() {
		return "|Họ tên: " + getHoTen() + " |Phòng ban: " + phongBan + " |Chức vụ: " + chucVu
				+ " |Số ngày công: " + getSoNgayCong() + " |Phụ cấp: " + getPhuCap()
				+ " |Hệ số lương: "	+ getHeSoLuong() + " |Lương: " + getLuong() + " |";
	}
	
	
	
	
}