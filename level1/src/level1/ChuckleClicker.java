package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame f1;
	JButton b1;
	JButton b2;
	JPanel p1;
	public static void main(String [] args){
		ChuckleClicker chuckle = new ChuckleClicker();
		chuckle.makeButton();
	}

	private void makeButton() {
		f1 = new JFrame();
		b1 = new JButton();
		b2 = new JButton();
		p1 = new JPanel();
		f1.setSize(500, 500);
		f1.setVisible(true);
		f1.add(p1);
		p1.add(b1);
		p1.add(b2);	
		f1.setTitle("hagotem");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b1.setText("joke");
		b2.setText("punchline");
		f1.pack();
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			System.out.println("hello");
			JOptionPane.showMessageDialog(null, "Did you see the owner of the Seafood Shop?");
			
		}
		if(e.getSource() == b2){
			System.out.println("hello");
			JOptionPane.showMessageDialog(null, "Yeah, he's a little #SHELLFISH. BOOM!");
		}
		
	}
	
	
		
	}  
	
	//Use JOptionPane to print the joke or the punchline depending on which button was clicked.
