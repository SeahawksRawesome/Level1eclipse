package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calgui implements ActionListener {
	public static void main(String[] args) {
		calgui m = new calgui();
	}
	calc solve; 
	JFrame f1;
	JPanel p1;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JTextField jtf1;
	JTextField jtf2;
	JLabel j1;

	calgui() {
		f1 = new JFrame();
		p1 = new JPanel();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		f1.add(p1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		jtf1 = new JTextField(10);
		jtf2 = new JTextField( 10);
		f1.setVisible(true);
		f1.setSize(500, 500);
		b4.addActionListener(this);
		b3.addActionListener(this);
		b2.addActionListener(this);
		b1.addActionListener(this);
		b1.setText("divide");
		b2.setText("multiply");
		b3.setText("subtract");
		b4.setText("add");
		p1.add(jtf1);
		p1.add(jtf2);
		j1 = new JLabel();
		p1.add(j1);
		solve = new calc();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String	t = jtf1.getText();
		int z = Integer.parseInt(t);
		String	q = jtf2.getText();
		int y = Integer.parseInt(q);
		
		if(e.getSource() == b1){
		
		int b = solve.divide(z, y);
		j1.setText("" + b);
		}
		if(e.getSource() == b2){
			int b =	solve.multiply(z, y);
				j1.setText("" + b);
		}
		if(e.getSource() == b3){
				int b = solve.subtract(z, y);
				j1.setText("" + b);
		}
		if(e.getSource() == b4){
				int b = solve.add(z, y);
				j1.setText("" + b);
		}
	}
}