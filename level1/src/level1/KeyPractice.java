package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class KeyPractice implements KeyListener, ActionListener{
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button2;
	JTextField field;
	JTextField field2;

	public static void main(String [] args){
		KeyPractice m= new KeyPractice();
	}
	KeyPractice(){
		field = new JTextField(5);
		field2 = new JTextField(5);
		frame = new JFrame();
		button = new JButton();
		button2 = new JButton();
		panel = new JPanel();
		button2.setText("add");
		button.setText("Multiply");
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		frame.setTitle("calculator");
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(field);
		panel.add(field2);
		button2.addActionListener(this);

	}	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, (char)e.getKeyCode());
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(field.getText());
		int w = Integer.parseInt(field.getText());
		if(e.getSource() == button2){
			JOptionPane.showMessageDialog(null, w + i);
		}
	}
}