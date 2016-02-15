package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class factor implements ActionListener {
	JTextField jt1;
	JFrame f1;
	JPanel p1;
	JButton b1;
	String w = "";
	
	public static void main(String[] args) {
		factor m = new factor();
	}
	factor(){
		jt1 = new JTextField(12);
		f1 = new JFrame();
		p1 = new JPanel();
		b1 = new JButton();
		f1.add(p1);
		p1.add(b1);
		p1.add(jt1);
		b1.addActionListener(this);
		f1.setSize(500, 500);
		f1.setVisible(true);
		b1.setText("submit");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			String q = jt1.getText();
			int x = Integer.parseInt(q);
			for(int i = 1; i <= x; i++){
				if( x%i == 0 ){
					 w += i + " "; 
				}
			}
			JOptionPane.showMessageDialog(null, "duh dumbles(factors) r " +  w  + " an bluureh fas carrs what u dink" );
		}
		
	}

}
