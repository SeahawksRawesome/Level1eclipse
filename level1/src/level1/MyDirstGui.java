package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyDirstGui implements ActionListener{
	JFrame window;
	JPanel panel;
	JButton button;
	JButton button2;
	JTextField jtf;
	JLabel label;
	public static void main(String[] args) {

	MyDirstGui m = new MyDirstGui();
	}
	MyDirstGui(){
		System.out.println("hello");
		window = new JFrame("Button time");
		window.setVisible(true);
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		window.add(panel);
		button= new JButton("Shoot");
		panel.add(button);
		button.addActionListener(this);
		button2= new JButton("Pause");
		panel.add(button2);
		button2.addActionListener(this);
		jtf = new JTextField(5);
		panel.add(jtf);
		label = new JLabel("Username");
		panel.add(label);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== button)
		{
			label.setText(jtf.getText());
		}
		if(e.getSource()== button2)
		{
			JOptionPane.showMessageDialog(null, jtf.getText());
		}
		}
		
	}

