import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculater {
	private JTextField field; 
	public static void main (String args []){
		Calculater cal = new Calculater();
		cal.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		
		
		JPanel text = new JPanel();
		this.field = new JTextField("                                             ");
		JButton c = new JButton("C");
		
		text.add(field);
		text.add(c);
		
		
		JPanel panel = new JPanel();
				
		JButton a7 = new JButton("7");
		a7.addActionListener(new A7Listener());
		JButton a8 = new JButton("8");
		a8.addActionListener(new A8Listener());
		JButton a9 = new JButton("9");	
		a9.addActionListener(new A9Listener());
		JButton a0 = new JButton("+");
		a0.addActionListener(new A0Listener());

		panel.add(a7);
		panel.add(a8);
		panel.add(a9);
		panel.add(a0);
		
		
		JPanel panel1 = new JPanel();
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new B4Listener());
		JButton b5 = new JButton("5");
		b5.addActionListener(new B5Listener());
		JButton b6 = new JButton("6");
		b6.addActionListener(new B6Listener());
		JButton b0 = new JButton("-");
		b0.addActionListener(new B0Listener());
		
		panel1.add(b4);
		panel1.add(b5);
		panel1.add(b6);
		panel1.add(b0);
		
		JPanel panel2 = new JPanel();
		
		JButton c1 = new JButton("1");
		c1.addActionListener(new C1Listener());
		JButton c2 = new JButton("2");
		c2.addActionListener(new C2Listener());
		JButton c3 = new JButton("3");
		c3.addActionListener(new C3Listener());
		JButton c0 = new JButton("*");
		c0.addActionListener(new C0Listener());
		
		panel2.add(c1);
		panel2.add(c2);
		panel2.add(c3);
		panel2.add(c0);
		
		JPanel panel3 = new JPanel();
		
		JButton d1 = new JButton(".");
		d1.addActionListener(new D1Listener());
		JButton d2 = new JButton("0");
		d2.addActionListener(new D2Listener());
		JButton d3 = new JButton("=");
		d3.addActionListener(new D3Listener());
		JButton d4 = new JButton("/");
		d4.addActionListener(new D4Listener());
		
		panel3.add(d1);
		panel3.add(d2);
		panel3.add(d3);
		panel3.add(d4);
		
		JPanel outer = new JPanel();
		outer.setLayout(new BoxLayout(outer, BoxLayout.Y_AXIS));
		outer.add(text);
		outer.add(panel);
		outer.add(panel1);
		outer.add(panel2);
		outer.add(panel3);
		
		panel.setPreferredSize(new Dimension(200, 300));
		panel1.setPreferredSize(new Dimension(200, 300));
		panel2.setPreferredSize(new Dimension(200, 300));
		panel3.setPreferredSize(new Dimension(200, 300));
		
		frame.getContentPane().add(BorderLayout.CENTER, outer);
		
		
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	private class A7Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("7");
		}
	}
	private class A8Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("8");
		}
	}
	private class A9Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("9");
		}
	}
	private class A0Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("+");
		}
	}
	private class B4Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("4");
		}
	}
	private class B5Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("5");
		}
	}
	private class B6Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("6");
		}
	}
	private class B0Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("-");
		}
	}
	private class C1Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("1");
		}
	}
	private class C2Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("2");
		}
	}
	private class C3Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("3");
		}
	}
	private class C0Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("*");
		}
	}
	private class D1Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText(".");
		}
	}
	private class D2Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("0");
		}
	}
	private class D3Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			field.setText("=");
		}
	}
	private class D4Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			 field.setText("/");
		}
	}

}

