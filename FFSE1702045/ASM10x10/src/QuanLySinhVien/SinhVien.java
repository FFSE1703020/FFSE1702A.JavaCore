package QuanLySinhVien;
import java.util.Scanner;
public class SinhVien {
private int id;
private String nameSV;
private int yearSV;
private String addressSV;
private float avgSV;
public void updateinfSV() {
	Scanner input = new Scanner(System.in); 
	System.out.println("Nhap ten Sinh Vien");
	nameSV = input.nextLine();
	System.out.println("Nhap nam sinh Sinh Vien");
	yearSV = input.nextInt();
	input.nextLine();
	System.out.println("Nhap dia chi Sinh Vien");
	addressSV = input.nextLine();
	System.out.println("Nhap diem Sinh Vien");
	avgSV = input.nextInt();
}
public void inputinfSV(int n) {
	for(int i = 1; i <n; i++) {
	Scanner input = new Scanner(System.in); 
	System.out.println("Nhap ten Sinh Vien");
	nameSV = input.nextLine();
	System.out.println("Nhap nam sinh Sinh Vien");
	yearSV = input.nextInt();
	input.nextLine();
	System.out.println("Nhap dia chi Sinh Vien");
	addressSV = input.nextLine();
	System.out.println("Nhap diem Sinh Vien");
	avgSV = input.nextInt();
	id =i;
} 
}

public void outputinfSV() {
System.out.println("id"+ id+ "sinh vien" + " "  +nameSV+ " nam sinh" + " "  +  yearSV + " "  + "dia chi" + " "   + addressSV + "diem" + " "   + avgSV );
}

public void dockingSV() {}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNameSV() {
	return nameSV;
}
public void setNameSV(String nameSV) {
	this.nameSV = nameSV;
}
public int getYearsSV() {
	return yearSV;
}
public void setYearsSV(int yearsSV) {
	this.yearSV = yearsSV;
}
public String getAddressSV() {
	return addressSV;
}
public void setAddressSV(String addressSV) {
	this.addressSV = addressSV;
}
public float getAvgSV() {
	return avgSV;
}
public void setAvgSV(int avgSV) {
	this.avgSV = avgSV;
}

}