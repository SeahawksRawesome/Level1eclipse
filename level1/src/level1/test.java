package level1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test {
	JFrame f1;
	JButton b1;
	JButton b2;
	JPanel p1;
	JLabel l1;
	JTextField jtf1;

	public static void main(String[] args) {
		test m = new test();
	}

	test() {
		f1 = new JFrame();
		b1 = new JButton();
		b2 = new JButton();
		p1 = new JPanel();
		l1 = new JLabel();
		jtf1 = new JTextField();
		f1.setVisible(true);
		f1.setSize(500, 500);
		f1.add(p1);
		p1.add(b1);
		p1.add(b2);
		p1.add(jtf1);
		p1.add(l1);
		b1.setText("Hint");
		b1.setText("Submit");

	}
}
