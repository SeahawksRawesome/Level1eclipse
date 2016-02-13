package level1;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class moleawhack implements ActionListener{
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b13;
	JButton b14;
	JButton b15;
	JButton b16;
	JButton b17;
	JButton b18;
	JButton b19;
	JButton b20;
	JButton b21;
	JButton b22;
	JButton b23;
	JButton b24;
	JFrame f1;
	JPanel p1;
	
	public static void main(String [] args){
		moleawhack m = new moleawhack();
	}
	
	//Make a drawButtons method that takes a random number as a parameter. It should make a GUI like this, but the “mole!” location is random.
	//[Hint: set the size of the frame rather than packing it.]
	public moleawhack(){
		drawButtons(new Random(24));
	}
	public void drawButtons(Random mole){
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();
		b10 = new JButton();
		b11 = new JButton();
		b12 = new JButton();
		b13 = new JButton();
		b14 = new JButton();
		b15 = new JButton();
		b16 = new JButton();
		b17 = new JButton();
		b18 = new JButton();
		b19 = new JButton();
		b20 = new JButton();
		b21 = new JButton();
		b22 = new JButton();
		b23 = new JButton();
		b24 = new JButton();
		p1 = new JPanel();
		f1 = new JFrame();
		f1.add(p1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p1.add(b10);
		p1.add(b11);
		p1.add(b12);
		p1.add(b13);
		p1.add(b14);
		p1.add(b15);
		p1.add(b16);
		p1.add(b17);
		p1.add(b18);
		p1.add(b19);
		p1.add(b20);
		p1.add(b21);
		p1.add(b22);
		p1.add(b23);
		p1.add(b24);
		p1.add(b1);
		f1.setSize(300, 300);
		f1.setVisible(true); 
		
		 }



//If they click on a button other than “mole!”, use this speak() method to call them a dork. 
void speak(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}


//Dispose of the frame and draw the buttons anew.
//After they’ve whacked 10 moles, call this endGame() method.
private void endGame(Date timeAtStart, int molesWhacked) {
Date timeAtEnd = new Date();
JOptionPane.showMessageDialog(null, "Your whack rate is "
+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
}

//Progressively insult them if they hit something other than the mole! button.
//If they get click an empty button twice, call them an idiot.
//If they click an empty button three times, call them a moron.
//If they click an empty button four times, call them a complete waste of atoms.
//[Use a switch statement for extra amazingness.]

//Call this playSound() method when they hit a mole.
private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

@Override
public void actionPerformed(ActionEvent e) {
	
}

}
