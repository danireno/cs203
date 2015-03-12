import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
public class Maintest{
	public static void main(String args[]){
		
		Maintest check=new Maintest();
		check.Boarder();
	}
public void Boarder () {
		JFrame frame=new JFrame("Boarder check");
		
		JPanel panel=new JPanel();
	
		JButton AButton = new JButton("A");
		AButton.setPreferredSize(new Dimension(100,100));
		AButton.addActionListener(new A());
		JButton BButton = new JButton("B");
		BButton.setPreferredSize(new Dimension(100,100));
		BButton.addActionListener(new B());
    	JButton CButton = new JButton("C");
    	CButton.setPreferredSize(new Dimension(100,100));
    	CButton.addActionListener(new C());
		JButton DButton =new JButton("D");
		DButton.setPreferredSize(new Dimension(100,100));
		DButton.addActionListener(new D());
		
	
	    panel.add(AButton);
		panel.add(BButton);
		panel.add(CButton);
		panel.add(DButton);
		
		
		frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}
private class A implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("A is Pressed ");
		
	}
	
	
}

private class B implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	    System.out.println("B is pressed");
		
	}
}
	
private class C implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	     System.out.println("C is pressed");
		
	}
}

private class D implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("D is pressed");
		
	}
	
}
	

	

}


