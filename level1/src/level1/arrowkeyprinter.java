package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class arrowkeyprinter implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	int bt1 = 0;
	int bt2 = 1;
	int bt3 = 2;
	int bt4 = 3;
	int lastclick = -1;

	public static void main(String[] args) {
		arrowkeyprinter m = new arrowkeyprinter();

	}

	arrowkeyprinter() {
		frame = new JFrame();
		panel = new JPanel();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b1.setText("up");
		b2.setText("down");
		b3.setText("right");
		b4.setText("left");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (b1 == e.getSource()) {
			if (lastclick != bt1) {
				System.out.println("up");
				lastclick = bt1;
			}
		}
		if (b2 == e.getSource()) {
			if (lastclick != bt2) {
				System.out.println("down");
				lastclick = bt2;
			}
		}
			if (b3 == e.getSource()) {
				if (lastclick != bt3) {
					System.out.println("right");
					lastclick = bt3;
				}
			}
				if (b4 == e.getSource()) {
					if (lastclick != bt4) {
						System.out.println("left");
						lastclick = bt4;
					}

				}
			}
}