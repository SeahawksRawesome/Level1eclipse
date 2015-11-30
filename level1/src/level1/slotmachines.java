package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class slotmachines implements ActionListener {
	JFrame f1;
	JPanel p1;
	JLabel l1;
	JButton b1;
	JLabel l2;
	JLabel l3;
	int i;
	int c;
	int x;
	JTextField tf1;
	JLabel l4 ;
	int y = 1000;

	public static void main(String[] args) {
		slotmachines m =  new slotmachines();
	}
	slotmachines() {
		f1 = new JFrame();
		p1 = new JPanel();
		l1 = new JLabel();
		b1 = new JButton();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		tf1 = new JTextField();
		f1.add(p1);
		p1.add(b1);
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(tf1);
		f1.setVisible(true);;
		f1.setSize(500, 500);
		b1.setText("Spin to win... or not!");
		b1.addActionListener(this);
		l4.setText("" +  y);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(b1 == e.getSource()){
			 i = new Random().nextInt(2);
			x = new Random().nextInt(2);
		 c = new Random().nextInt(2);
		 l1.setText("" + i);
		 l2.setText("" + x);
		 l3.setText("" + c);
		 String r = tf1.getText();
		int s = Integer.parseInt(r);
		 if(c == i && c == x){
			 System.out.println("You Won");
			int a =  s *= 10;
			y +=a;
			l4.setText("" + y);
			 
		 }
		 if(c != i || c != x){
			 System.out.println("You Lost");
			y -= s;
			l4.setText("" + y);
			 
		 }
		}
		
	}
}
