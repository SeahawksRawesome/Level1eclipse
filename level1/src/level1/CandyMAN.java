package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CandyMAN implements ActionListener {
	JButton b1;
	int sum = 0;
	JPanel p1;

	// To summon the Candyman, say his name 5 times in the mirror. You can watch
	// the movie trailer if you like.
	public static void main(String[] args) {
		CandyMAN EVIL = new CandyMAN();
	}

	CandyMAN() {

		b1 = new JButton();
		JFrame frame = new JFrame();
		JPanel p1 = new JPanel();
		frame.add(p1);
		p1.add(b1);
		b1.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(500, 500);
		b1.setSize(100, 100);
		b1.setText("meh name is jeff");

	}
	// Create a user interface that has a single button labeled “Candyman”.

	// When the user presses it 5 times, show them a scary picture from the
	// internet using the method below.

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	// And also play a SCARY or CREEPY sound.

	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void playSound(int whichSound) {
		File soundFile = null;
		if (whichSound == CREEPY)
			soundFile = new File("/Users/Guest/Google Drive/league-sounds/creepy-noise.wav");
		else if (whichSound == SCREAM)
			soundFile = new File("/Users/League/Google Drive/league-sounds/scream.wav");
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1 && sum == 5) {
			showPictureFromTheInternet("http://www.mypokecard.com/en/Gallery/my/galery/NdMXOfyK0WUE.jpg");
			playSound(1);
		} else {
			sum += 1;
		}
	}
}
