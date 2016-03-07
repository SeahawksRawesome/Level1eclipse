import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Randomcolors implements KeyListener {
	JFrame f1;
	JPanel p1;
	public static void main(String [] args){
		Randomcolors m = new Randomcolors();
	}
	Randomcolors() {
		f1 = new JFrame();
		p1 = new JPanel();	
		f1.setVisible(true);
		f1.add(p1);
		f1.addKeyListener(this);
		f1.setSize(500, 500);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		Random random = new Random();
		p1.setBackground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
		p1.repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
