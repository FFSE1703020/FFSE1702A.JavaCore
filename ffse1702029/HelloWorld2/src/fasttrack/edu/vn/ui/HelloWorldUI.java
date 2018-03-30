package fasttrack.edu.vn.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HelloWorldUI extends JFrame {
	private int a;
	private int b;
	JTextField txtResult;

	public HelloWorldUI(String title) {
		super(title);
		addControls();
	}

	public HelloWorldUI(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public double giai() {
		return (-(double)this.b/this.a);
	}
	public void addControls() {

		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));

		JPanel pnTitle = new JPanel();
		JLabel lblTitle = new JLabel("Chương trình GPTB1");
		Font fontTitle = new Font("arial", Font.BOLD, 20);
		lblTitle.setFont(fontTitle);

		pnTitle.add(lblTitle);

		JPanel pnInput1 = new JPanel();
		JLabel lblTitle1 = new JLabel("Nhập hệ số a:");
		JTextField txtHeSoA = new JTextField(15);
		pnInput1.add(lblTitle1);
		pnInput1.add(txtHeSoA);

		JPanel pnInput2 = new JPanel();
		JLabel lblTitle2 = new JLabel("Nhập hệ số b:");
		JTextField txtHeSoB = new JTextField(15);
		pnInput2.add(lblTitle2);
		pnInput2.add(txtHeSoB);

		JPanel pnAction = new JPanel();
		JButton btnCalc = new JButton("Calculate");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(txtHeSoA.getText());
				int b = Integer.parseInt(txtHeSoB.getText());
				Component frame;
				if (a == 0 && b == 0) {
					JOptionPane.showMessageDialog(null, "phương trình vô số nghiệm");
				} else if (a == 0 && b != 0) {
					JOptionPane.showMessageDialog(null, "phương trình vô nghiệm");
				} else {
					HelloWorldUI ass = new HelloWorldUI(a, b);

					txtResult.setText("x = " + String.valueOf(ass.giai()));
				}
			}
		});
		JButton btnExit = new JButton("Exit");
		pnAction.add(btnCalc);
		pnAction.add(btnExit);

		JPanel pnResult = new JPanel();
		JLabel lblTitleResult = new JLabel("Nghiệm: ");
		 txtResult = new JTextField(15);
		pnResult.add(lblTitleResult);
		pnResult.add(txtResult);

		pnMain.add(pnTitle);
		pnMain.add(pnInput1);
		pnMain.add(pnInput2);
		pnMain.add(pnAction);
		pnMain.add(pnResult);

		con.add(pnMain);
	}

	public void showWindow() {
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
