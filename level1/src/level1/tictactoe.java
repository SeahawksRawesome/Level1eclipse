package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class tictactoe implements ActionListener{
	JFrame b;
	JPanel f;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	String bt = "o";
	boolean truemoo = false;
	public static void main(String[] args) { 
	tictactoe	m = new tictactoe();
	
	}
	
	tictactoe(){
		b = new JFrame();
		f = new JPanel();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();
		b10 = new JButton();
		b.setVisible(true);
		b.setSize(300, 300);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.add(f);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b10.setText("click to switch player");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource() == b1 || e.getSource() == b2 ||
		e.getSource() == b3 || e.getSource() == b4 || 
		e.getSource() == b5 || e.getSource() == b6 || 
		e.getSource() == b7 || e.getSource() == b8 || 
		e.getSource() == b9) && !truemoo){
			((JButton)e.getSource()).setText(bt);
			truemoo = true;
		}
		
		if(e.getSource() == b10 ){
			truemoo = false;
			if(bt.equals ("x")){
				bt = "o";
			}
			else{
				bt = "x";
			}
		}
		
		
		
		
		
	}
}
