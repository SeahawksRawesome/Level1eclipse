package level1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter implements MouseListener {
	JFrame f1;
	JLabel l1;
	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want to get out of the
	 * static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}
	
	private void createBook() {
		f1 = new JFrame();
		f1.setVisible(true);
		f1.setSize(500, 500);
		String x = "images.jpg";
		String y = "images.png";
		l1 = new JLabel();
		l1 = loadImageFromComputer(x);
		f1.add(l1);
		f1.pack();
		f1.addMouseListener(this);
		}

	public void mousePressed(MouseEvent e) {
		if(e.getSource() == f1){
			System.out.println("clicked");
			f1.remove(l1);	
			String y = "images.png";
			l1 = loadImageFromComputer(y);
			f1.add(l1);
			f1.pack();
		}
		

		// 14. pack the frame
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


