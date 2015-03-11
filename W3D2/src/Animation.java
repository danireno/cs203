
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static java.awt.BorderLayout.*;
import static javax.swing.JFrame.*;

public class Animation {

	private JFrame frame;
	private int x = 0;
	private int y = 0;
	private boolean up;
	private boolean down;
	private boolean left;
	private boolean right;

	public static void main(String[] args) {
		Animation a = new Animation();

		a.go();
	}

	public void go() {
		frame = new JFrame("Moving ball");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		DrawPanel d = new DrawPanel();
		frame.getContentPane().add(CENTER, d);
		frame.getContentPane().addKeyListener(new MykeyListener());

		frame.setSize(300, 300);
		frame.setVisible(true);

		while (true) {
			if (up) {
				y -= 1;
			} else if (down) {
				y += 1;
			}
			if (left) {
				x -= 1;
			} else if (right) {
				x += 1;
			}
			try {
				Thread.sleep(10);
				frame.repaint();
			} catch (Exception e) {
			}
		}

	}

	public class MykeyListener implements KeyListener {

		public void keyPressed(KeyEvent ke) {

			if (ke.getKeyCode() == KeyEvent.VK_UP) {
				up = true;
			}
			if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
				down = true;
			}
			if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
				left = true;
			}
			if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
				right = true;
			}
		}

		public void keyRelesed(KeyEvent ke) {

			if (ke.getKeyCode() == KeyEvent.VK_UP) {
				up = false;
			}
			if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
				down = false;
			}
			if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
				left = false;
			}
			if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
				right = false;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public class DrawPanel extends JPanel {

		@Override
		public void paintComponent(Graphics g) {
			g.setColor(Color.black);
			g.fillRect(0, 0, getWidth(), getHeight());

			g.setColor(Color.blue);
			g.fillOval(x, y, 25, 25);
		}
	}

}
