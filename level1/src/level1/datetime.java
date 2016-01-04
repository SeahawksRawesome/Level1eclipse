package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class datetime implements ActionListener{
	
	JFrame b;
	JPanel p;
	JButton l;
	JButton a;
	Calendar cal = Calendar.getInstance(); 
	String date = cal.getTime().toString();
	
	public static void main(String [] args){
		datetime m = new datetime();
	}
	datetime() {
		b = new JFrame();
		p = new JPanel();
		l = new JButton();
		a = new JButton();
		b.add(p);
		p.add(a);
		p.add(l);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.setVisible(true);
		b.setSize(500, 500);
		l.setText("time");
		a.setText("date");
		a.addActionListener(this);
		l.addActionListener(this);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar cal = Calendar.getInstance(); 
		String date = cal.getTime().toString();
		String t  = date.substring(13,23);
		String g = date.substring(11,13);
		int r = Integer.parseInt(g);
		if(r > 12){
			r -= 12;
		}
		if(e.getSource() == a){
			System.out.println(date.substring(0,11));
		}
		if(e.getSource() == l){
			System.out.println(r + t);
		}
	}
}
	
