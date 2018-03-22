package Quanlycanbo;

import java.util.*;
public class CanBo {
	private String maCanBo;
	public String getMaCanBo() {
		return maCanBo;
	}

	public void setMaCanBo(String maCanBo) {
		this.maCanBo = maCanBo;
	}

	private String hoTen;
	private float heSoLuong;
	Scanner myInput = new Scanner(System.in);
	
	public CanBo() {
		super();
	}
	
	public CanBo(String hoTen, float heSoLuong) {
		super();
		this.hoTen = hoTen;
		this.heSoLuong = heSoLuong;
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
		Scanner scn = new Scanner(System.in);
		for(;;) {
		
		System.out.println("nhap ho ten:");
		String hoTen = scn.nextLine();
		try {
			CanBoException.chkHoTen(hoTen);
			setHoTen(hoTen);
			break;
		}
		catch(CanBoException e){
		    System.out.println(e);
		    
		     }
		
		}
	}
	
	public void nhapHeSoLuong() {
		System.out.print("Nhap he so luong: ");
		float heSoLuong = Float.parseFloat(myInput.nextLine());
		this.setHeSoLuong(heSoLuong);
	}
}