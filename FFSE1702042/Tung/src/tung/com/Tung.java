package tung.com;
import java.util.Scanner;
public class Tung {
	 public static void main(String[] args) {
		 Scanner myInput=new Scanner(System.in);
	       System.out.println("Bạn chưa thuộc Bảng cửu chương nào");
	        System.out.println("nhập vào 1 số:");
	        int i=myInput.nextInt();
	       int num=1;
	        while(num<=10) {
	           for(int j=1;j<=i;j++) {
	           System.out.print(j + " x " + num + " = " + (num*j));
	           System.out.print("		");
	           
	        	}
	           num++;
	           System.out.println();
	    }
	 }
}

	 

