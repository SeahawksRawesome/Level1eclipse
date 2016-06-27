package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Jeporady2 implements ActionListener {
	JPanel p1;
	JFrame f1;
	JButton b1;
	JButton b2;
	JButton b3;
	
	public static void main(String [] args){
		Jeporady2 m = new Jeporady2();
	}
	Jeporady2(){
		p1 = new JPanel();
		f1 = new JFrame();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		f1.add(p1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		f1.setVisible(true);
		f1.setSize(500, 500);
		b1.setText("Star Wars");
		b2.setText("Halo");
		b3.setText("Video Games");
		b2.addActionListener(this);
		b1.addActionListener(this);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1){
			String z = JOptionPane.showInputDialog("Who is CT-7567?");
			if(z.equals("Captain Rex")){
				JOptionPane.showMessageDialog(null, "correct");
			}
			else{
				JOptionPane.showMessageDialog(null, "Incorrect");
			}
		}
			if(e.getSource() == b2){
				String x = JOptionPane.showInputDialog("What is the name of the corporation fighting the covenant?");
				if(x.equals("UNSC")){
					JOptionPane.showMessageDialog(null, "correct");
				}
				else{
					JOptionPane.showMessageDialog(null, "Incorrect");
				}
			}
				if(e.getSource() == b3){
					String c = JOptionPane.showInputDialog("What was the first video game ever created?");
					if(c.equals("Pong")){
						JOptionPane.showMessageDialog(null, "correct");
					}
					else{
						JOptionPane.showMessageDialog(null, "Incorrect");
					}
				}
		}
	}
	
	
	
	
	
	
	
	
	
	
	

