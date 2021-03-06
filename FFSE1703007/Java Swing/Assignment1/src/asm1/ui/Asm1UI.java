package asm1.ui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Asm1UI extends JFrame {
	JTextField txtFactorA, txtFactorB, txtResult;
	JButton btnCalc, btnExit;

	public Asm1UI(String title) {
		super(title);
		addControls();
		addEvents();
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
		txtFactorA = new JTextField(15);
		pnInput1.add(lblTitle1);
		pnInput1.add(txtFactorA);

		JPanel pnInput2 = new JPanel();
		JLabel lblTitle2 = new JLabel("Nhập hệ số b:");
		txtFactorB = new JTextField(15);
		pnInput2.add(lblTitle2);
		pnInput2.add(txtFactorB);

		JPanel pnAction = new JPanel();
		btnCalc = new JButton("Calculate");
		btnExit = new JButton("Exit");
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

	ActionListener eventCalcX = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			calcX();
		}
	};

	public void calcX() {
		String s1 = txtFactorA.getText();
		String s2 = txtFactorB.getText();
		float a = Float.parseFloat(s1);
		float b = Float.parseFloat(s2);
		String x;
		if (a == 0) {
			if (b == 0) {
				x = "Phương trình có vô số nghiệm";
			} else {
				x = "Phương trình vô nghiệm";
			}
		} else {
			x = Float.toString(-b / a);
		}
		txtResult.setText(x);
	}

	public void addEvents() {
		btnCalc.addActionListener(eventCalcX);
		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

	public void showWindow() {
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
