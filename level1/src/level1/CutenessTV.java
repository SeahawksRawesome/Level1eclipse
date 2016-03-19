package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame f1;
	JButton b1;
	JButton b2;
	JButton b3;
	JPanel p1;
	//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever.
	public static void main(String [] args){
		CutenessTV m = new CutenessTV();
		
	}
	CutenessTV(){
		f1 = new JFrame();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		p1 = new JPanel();
		f1.setVisible(true);
		f1.setSize(500, 500);
		f1.add(p1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		f1.pack();
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		
	}
	void showDucks() {
			playVideo("EpiGS-3PDU8");
		}

		void showFrog() {
			playVideo("aSjCb-FfxhI");
		}
		
		void showFluffyUnicorns() {
			playVideo("qRC4Vk6kisY");
		}

		void playVideo(String videoID) {
			try {
		URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1 ){
				showDucks();
			}
			if(e.getSource() == b2){
				showFrog();
			}
			if(e.getSource() == b3) {
				showFluffyUnicorns();
			}
			
		}

//	NOTE: Duck video is missing

}
