<<<<<<< HEAD:FFSE1702042/canBo/src/Quanlycanbo/CanBo.java
package Quanlycanbo;
<<<<<<< HEAD

import java.util.*;
public class CanBo {
=======
import java.io.Serializable;
import java.util.*;
public class CanBo implements Serializable  {
>>>>>>> 86f8770633e2f4f086edb7cfd8c7be3439e672b5
	private String maCanBo;
	public String getMaCanBo() {
		return maCanBo;
	}

	public void setMaCanBo(String maCanBo) {
		this.maCanBo = maCanBo;
	}

=======
package Quanlycanbo.com;
import java.io.Serializable;
import java.util.*;
<<<<<<< HEAD

public class CanBo implements Serializable {
	private String hoTen;
	private float heSoLuong;
	private String maCanBo;
=======
public class CanBo {
>>>>>>> parent of 7aeaedb... ASM 1 vs 2 JavaSwing:FFSE1702011/Assignment 5/src/Quanlycanbo/com/CanBo.java
	private String hoTen;
	private float heSoLuong;
<<<<<<< HEAD
=======
	private double luong;
	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public Scanner getMyInput() {
		return myInput;
	}

	public void setMyInput(Scanner myInput) {
		this.myInput = myInput;
	}

>>>>>>> 86f8770633e2f4f086edb7cfd8c7be3439e672b5
	Scanner myInput = new Scanner(System.in);
>>>>>>> 45c6cc847d29ca7c683fcf8d24d00a1ee0c5e29f
	
	public CanBo() {
		super();
	}
	
	public CanBo(String hoTen, float heSoLuong) {
		super();
		this.hoTen = hoTen;
		this.heSoLuong = heSoLuong;
	}
	
	public String getMaCanBo() {
		return maCanBo;
	}

	public void setMaCanBo(String maCanBo) {
		this.maCanBo = maCanBo;
	}

	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public void nhapTen() {
		Scanner myInput = new Scanner(System.in);
		for(;;) {
			System.out.print("Nhap ho ten: ");
			try {
				String hoTen = myInput.nextLine();
				CanBoException.chkHoTen(hoTen);
				this.setHoTen(hoTen);
				break;
			} catch (CanBoException e) {
				System.out.print(e);
			}
		}
	}
	
	public void nhapHeSoLuong() {
		Scanner myInput = new Scanner(System.in);
		for(;;) {
			System.out.print("Nhap he so luong: ");
			float heSoLuong = Float.parseFloat(myInput.nextLine());
			try {
				this.setHeSoLuong(heSoLuong);
				CanBoException.chkSoDuong(heSoLuong);
				break;
			} catch (CanBoException e) {
				System.out.print(e);
			}
		}
	}
<<<<<<< HEAD
=======
	public double tinhLuong() {
		return 0;
	}
>>>>>>> 86f8770633e2f4f086edb7cfd8c7be3439e672b5
}
