package text;

import java.util.Scanner;

public class TTCanBo {
	String HoTen;
	String PhongBan;
	int HeSoLuong;
	int CuNhan = 300;
	int ThacSi = 500;
	int TienSi = 1000;
	int TruongPhong = 2000;
	int PhoPhong = 1000;
	int NhanVien = 500;
	int SoTietDay;
	int NgayCong;
	String ChucVu;

	public TTCanBo(String hoTen, String phongBan, int heSoLuong, int cuNhan, int thacSi, int tienSi, int truongPhong,
			int phoPhong, int nhanVien, int soTietDay, int ngayCong, String chucVu) {
		super();
		HoTen = hoTen;
		PhongBan = phongBan;
		HeSoLuong = heSoLuong;
		CuNhan = cuNhan;
		ThacSi = thacSi;
		TienSi = tienSi;
		TruongPhong = truongPhong;
		PhoPhong = phoPhong;
		NhanVien = nhanVien;
		SoTietDay = soTietDay;
		NgayCong = ngayCong;
		ChucVu = chucVu;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getPhongBan() {
		return PhongBan;
	}

	public void setPhongBan(String phongBan) {
		PhongBan = phongBan;
	}

	public int getHeSoLuong() {
		return HeSoLuong;
	}

	public void setHeSoLuong(int heSoLuong) {
		HeSoLuong = heSoLuong;
	}

	public int getCuNhan() {
		return CuNhan;
	}

	public void setCuNhan(int cuNhan) {
		CuNhan = cuNhan;
	}

	public int getThacSi() {
		return ThacSi;
	}

	public void setThacSi(int thacSi) {
		ThacSi = thacSi;
	}

	public int getTienSi() {
		return TienSi;
	}

	public void setTienSi(int tienSi) {
		TienSi = tienSi;
	}

	public int getTruongPhong() {
		return TruongPhong;
	}

	public void setTruongPhong(int truongPhong) {
		TruongPhong = truongPhong;
	}

	public int getPhoPhong() {
		return PhoPhong;
	}

	public void setPhoPhong(int phoPhong) {
		PhoPhong = phoPhong;
	}

	public int getNhanVien() {
		return NhanVien;
	}

	public void setNhanVien(int nhanVien) {
		NhanVien = nhanVien;
	}

	public int getSoTietDay() {
		return SoTietDay;
	}

	public void setSoTietDay(int soTietDay) {
		SoTietDay = soTietDay;
	}

	public int getNgayCong() {
		return NgayCong;
	}

	public void setNgayCong(int ngayCong) {
		NgayCong = ngayCong;
	}

	public String getChucVu() {
		return ChucVu;
	}

	public void setChucVu(String chucVu) {
		ChucVu = chucVu;
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên cán bộ: ");
		String hoTen = scanner.nextLine();
		this.setHoTen(hoTen);

		System.out.print("Nhập phòng ban: ");
		String PhongBan = scanner.nextLine();
		this.setPhongBan(PhongBan);

		System.out.print("Nhập phụ cấp: ");
		int PhuCap = scanner.nextInt();
		System.out.println("1. Cử Nhân");
		this.getCuNhan();
		System.out.println("2. Thạc Sĩ");
		this.getThacSi();
		System.out.println("3. Tiến Sĩ");
		this.getTienSi();
		System.out.println("4. Trưởng Phòng");
		this.getTruongPhong();
		System.out.println("5. Phó Phòng");
		this.getPhoPhong();
		System.out.println("6. Nhân Viên");
		this.getNhanVien
		();

		System.out.print("Nhập chức vụ: ");
		String ChucVu = scanner.nextLine();
		this.setChucVu(ChucVu);

		System.out.print("Nhập ngày công: ");
		int NgayCong = scanner.nextInt();
		this.setNgayCong(NgayCong);
	}

	public void xuat() {
		System.out.println("Tên cán bộ: " + this.getHoTen() + "\n" + "Phòng Ban: " + this.getPhongBan() + "\n" + "Chức vụ: " + this.getChucVu() + "/n" + "Phụ cấp: ");
	}
	
	public static void main(String[] args) {
		
	}
}
