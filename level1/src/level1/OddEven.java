package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OddEven implements ActionListener {
	JButton b1;
	JButton b2;
	JFrame f1;
	JPanel p1;
	JLabel l1;
	JLabel l2;
	Random r = new Random();

	public static void main(String[] args) {
		OddEven m = new OddEven();
	}

	OddEven() {
		f1 = new JFrame();
		p1 = new JPanel();
		l1 = new JLabel();
		l2 = new JLabel();
		b1 = new JButton();
		b2 = new JButton();
		f1.setVisible(true);
		f1.setSize(500, 500);
		f1.add(p1);
		p1.add(b1);
		p1.add(b2);
		p1.add(l1);
		p1.add(l2);
		b1.setText("Odd");
		b2.setText("Even");
		b1.addActionListener(this);
		b2.addActionListener(this);
		l1.setVisible(false);
		l2.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int y = r.nextInt(100);

			if (y % 2 == 1) {
				l1.setVisible(true);
				l1.setText(y + "");
			}

		}
		if (e.getSource() == b2) {
			int x = r.nextInt(100);
			if (x % 2 == 0) {
				l2.setVisible(true);
				l2.setText(x + "");
			}
		}

	}

}
