package JavaSwing;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
 
public class SwingControlDemo {
    
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingControlDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      SwingControlDemo  swingControlDemo = new SwingControlDemo();      
      swingControlDemo.showTextFieldDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Vi du Java Swing");
      mainFrame.setSize(500,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    

      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showTextFieldDemo(){
      headerLabel.setText("Vũ tập giải phương trình bậc 2"); 

      JLabel  SoALabel= new JLabel("Nhập số A: ", JLabel.RIGHT);
      JLabel  soBLabel = new JLabel("Nhập số B: ", JLabel.RIGHT);
      JLabel  soCLabel = new JLabel("Nhập số C: ", JLabel.RIGHT);
      final JTextField a = new JTextField(6);
      final JTextField b = new JTextField(6);
      final JTextField c = new JTextField(6);
 
     

      JButton loginButton = new JButton("Play");
      loginButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = a.getText();
            String data1 = b.getText();
            String data2 = c.getText();
            double i = Integer.parseInt(data);
            double j = Integer.parseInt(data1);
            double k = Integer.parseInt(data1);
            double l = j*j-4*i*k;
            double x1= (-j + Math.sqrt(l))/(2*i);
            double x2= (-j - Math.sqrt(l))/(2*i);
            if (l > 0) {
            	  statusLabel.setText("Phương trình:"+data+"x^2"+"+"+data1+"x+"+data2+"=0 Có nghiệm là x1=" + x1 +
                  		"x2=" + x2 );
            } else if (l == 0) {
            	  statusLabel.setText("Phương trình:"+data+"x^2"+"+"+data1+"x+"+data2+"=0 Có nghiệm là x1=x2=" +(-j/2*i));
            } else {
            	statusLabel.setText("Phương trình vô nghiệm" );
            }
        }


          
            		
          
      }); 

      controlPanel.add(SoALabel);
      controlPanel.add(a);
      controlPanel.add(soBLabel);       
      controlPanel.add(b);
      controlPanel.add(soCLabel);
      controlPanel.add(c);
      controlPanel.add(loginButton);
      mainFrame.setVisible(true);  
   }
}