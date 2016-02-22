package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class reswindow implements ActionListener {
	JFrame f1;
	JPanel p1;
	JButton b1;
	JLabel l4;
	JTextField jt1;
	JTextField jt2;
	JTextField jt3;

	public static void main(String[] args) {
		reswindow m = new reswindow();
	}

	reswindow() {
		f1 = new JFrame();
		p1 = new JPanel();
		b1 = new JButton();
		l4 = new JLabel();
		jt1 = new JTextField(40);
		jt2 = new JTextField(40);
		jt3 = new JTextField(40);
		f1.add(p1);
		p1.add(b1);
		p1.add(jt1);
		p1.add(jt2);
		p1.add(jt3);
		p1.add(l4);
		f1.setVisible(true);
		f1.setSize(500, 500);
		b1.addActionListener(this);
		jt1.setText("name");
		jt2.setText("time");
		jt3.setText("total");
		b1.setText("submit");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String q = jt1.getText();
			String h = jt2.getText();
			String j = jt3.getText();
			l4.setText(q + " " + h + " " + j);
		}

	}
}
