package level1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class simplequiz {
	JFrame window;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JLabel label;
	public static void main(String[] args) {
		simplequiz m = new simplequiz();
	}
	simplequiz(){
		window = new JFrame("Simple Quiz");
		window.setVisible(true);
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		window.add(panel);
		button1 = new JButton("");
		
		
	
		}
	}
	
	

