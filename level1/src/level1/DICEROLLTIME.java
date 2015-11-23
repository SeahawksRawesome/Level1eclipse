package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DICEROLLTIME implements ActionListener{
	JFrame bill;
	JPanel bob;
	JLabel jerry;
	JButton tim;
	JButton ham;
	int i;
	JLabel total;
	int total2;
	
	
	public static void main(String[] args) {
		DICEROLLTIME m = new DICEROLLTIME();
	}
	DICEROLLTIME(){
		bill = new JFrame();
		bob = new JPanel();
		jerry = new JLabel();
		tim = new JButton();
		bill.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bill.add(bob);
		bob.add(jerry);
		bob.add(tim);
		bill.setVisible(true);
		bill.setSize(500, 500);
		tim.setText("press me to roll fo days");
		ham = new JButton();
		total = new JLabel();
		bob.add(ham);
		bob.add(total);
		ham.setText("reset");
		tim.addActionListener(this);
		ham.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(tim == e.getSource()){
			 i = new Random().nextInt(6)+1;
			jerry.setText("" + i);
			total2 += i;
			total.setText("" + total2);
				
			}
		if(ham == e.getSource()){
			total2 = 0;
			total.setText("" + total2);
		}
		}
}
