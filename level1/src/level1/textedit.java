package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class textedit implements KeyListener, ActionListener {
	JPanel jp;
	JFrame jf;
	JLabel jl;
	String ts = "";

	public static void main(String[] args) {
		textedit m = new textedit();
	}

	textedit() {
		jp = new JPanel();
		jf = new JFrame();
		jl = new JLabel();
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.add(jp);
		jp.add(jl);
		jf.addKeyListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println(e.getKeyChar());
		 jl.setText(ts += e.getKeyChar());
	if(e.getKeyCode()== KeyEvent.VK_BACK_SPACE){
		if(ts.length() > 1){
			String ts1 = ts.substring(0, ts.length() -2); 
			jl.setText(ts1);
			ts = ts1;
		}
		
		
	}	
	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
