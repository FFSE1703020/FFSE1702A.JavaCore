import javax.swing.*;
import javafx.scene.text.Font;
import java.awt.event.*;  
public class PhuongTrinh implements ActionListener{  
	//tạo ô nhập 
    JTextField tf1,tf2,tf3;  
    //tạo button 
    JButton b1,b2,b3;  
    
    PhuongTrinh(){  
    		// thêm title 
        JFrame f= new JFrame("Day la phuong trinh bac 1 - noi tieng ");  
        JLabel a1,a2;  
        a1=new JLabel("Day La phuong trinh 1 an ");
        a1.setBounds(50,20, 200,30);
        //ô nhập thứ 1 
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20); 
        //chú thích cho ô nhập thứ 1 
        JLabel l1=new JLabel("he so a:");    
        l1.setBounds(0,35, 50,50);
        // ô nhập thứ 2 
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,20); 
        //chú thích cho ô nhập thứ 2  
        JLabel l2=new JLabel("he so b:");    
        l2.setBounds(0,85, 50,50);
        //ô button thứ 1
        b1=new JButton("giai");  
        b1.setBounds(20,200,50,50);
        //ô button thứ 2 
        b2=new JButton("thoat");  
        b2.setBounds(90,200,50,50);
        //ô button thứ 3
        b3=new JButton("help");  
        b3.setBounds(160,200,50,50);
        //ô kết quả 
        tf3=new JTextField();  
        tf3.setBounds(50,150,150,20);
        //cài đặt function 
        tf3.setEditable(false);   
        b1.addActionListener(this);  
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);f.add(l1);f.add(l2);f.add(b3);f.add(a1); 
        //cài đặt chiều rộng và chiều dài cho cửa sổ 
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c = 0 ; 
        //cài đặt chức năng cho button 
        if(e.getSource()==b1){ 
        		//	ax + b = 0;
          	c = -b/a ; 
        }else if(e.getSource()==b2){ 
        	 System.exit(0);
        	  
        }else if(e.getSource()==b3){ 
        	
        	//nếu click vào b1 thì .....   
        }
        String result = String.valueOf(c);  
        tf3.setText(result);
    }  
public static void main(String[] args) {  
    new PhuongTrinh();  
} }