package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyMineSweeper implements ActionListener {
	JFrame f1;
	JPanel p1;
	JButton WinButton;
	int rand;
	Random r;
	public static void main(String[] args) {
		MyMineSweeper m = new MyMineSweeper();

	}
	MyMineSweeper(){
		f1 = new JFrame();
		p1 = new JPanel();
	
		WinButton = new JButton();
	
		f1.setVisible(true);
		f1.setSize(500, 500);
		f1.add(p1);
		p1.add(WinButton);
		WinButton.addActionListener(this);
		Random r = new Random();
	 rand = r.nextInt(12);
		for(int i=0; i < 12; i++){
			if(i == rand){
				p1.add(WinButton);
			}
			else{
			JButton LoseButton = new JButton();
			LoseButton.addActionListener(this);
			p1.add(LoseButton);
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == WinButton){
			JOptionPane.showMessageDialog(null, "You Win!");
			p1.removeAll();
			Random r = new Random();
			 rand = r.nextInt(12);
				for(int i=0; i < 12; i++){
					if(i == rand){
						p1.add(WinButton);
					}
					else{
					JButton LoseButton = new JButton();
					LoseButton.addActionListener(this);
					p1.add(LoseButton);
					}
				}
		}
		else{
			JOptionPane.showMessageDialog(null, "You Lose...");
			
				}
		}
		
	}


