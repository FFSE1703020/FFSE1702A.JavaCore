package Assignment5;
import java.util.Scanner;
public class CanBo {
       private String hoTen;
       private int phuCap;
       private float heSoLuong;
       private double luong;
       public CanBo() {
    	   
       }
	public CanBo(String hoTen, int phuCap, float heSoLuong, double luong) {
		super();
		this.hoTen = hoTen;
		this.phuCap = phuCap;
		this.heSoLuong = heSoLuong;
		this.luong = luong;
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
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
       public void nhap() {
    	   Scanner scn= new Scanner(System.in);
    	   System.out.println("nhap ho ten:");
    	   String hoTen= scn.next();
    	   setHoTen(hoTen);
    	   
    	   System.out.println("nhap he so luong:");
    	   float heSoLuong= scn.nextFloat();
    	   setHeSoLuong(heSoLuong);
       
       }
       public double tinhLuong() {
    	   return 0;
       }
       public void xuat() {
    	   
           System.out.print("Ten:"+ hoTen);
           System.out.print("He So Luong:"+ heSoLuong);
       }
 }
