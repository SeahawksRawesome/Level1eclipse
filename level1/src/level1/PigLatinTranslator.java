package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Part 1: 

//Make a UI that looks something like this:



//Part 2: 

//Using the class below, translate a word from left to right when the translate button is pressed.


//--------------------------------------------------------------------

public class PigLatinTranslator implements ActionListener {
	public static void main(String [] args){
		PigLatinTranslator m = new PigLatinTranslator();
	}
	JFrame f1;
	JPanel p1;
	JButton b1;
	JTextField jtf1;
	JTextField jtf2;
	 PigLatinTranslator(){
		  f1 = new JFrame();
		p1 = new JPanel();
		b1 = new JButton();
		jtf1 = new JTextField(50);
		jtf2 = new JTextField(50);
		f1.add(p1);
		p1.add(b1);
		p1.add(jtf1);
		p1.add(jtf2);
		f1.setVisible(true);
		f1.setSize(500, 500);
		
		b1.setText("Translate");
		b1.addActionListener(this);
	  }  
	 public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == b1){
				
				//String word = pigWord(jtf1.getText());
				String word = translate(jtf1.getText());
				jtf2.setText(word); 
				
				
	 }
	 }
	/**
	   * Method to test whether a character is a letter or not.
	   * @param c The character to test
	   * @return True if it's a letter
	   */
			private static boolean isLetter(char c) {
			    return ( (c >='A' && c <='Z') || (c >='a' && c <='z') );
			  }


	  /**
	   * Method to translate one word into pig latin.
	   * @param word The word in english
	   * @return The pig latin version
	   */
	  private static String pigWord(String word) {
	    int split = firstVowel(word);
	    return word.substring(split)+"-"+word.substring(0, split)+"ay";
	  }
	
	  /**
	   * Method to translate a sentence word by word.
	   * @param s The sentence in English
	   * @return The pig latin version
	   */
	  public String translate(String s) {
	    String latin = "";
	    int i = 0;
	    while (i<s.length()) {

	      // Take care of punctuation and spaces
	      while (i<s.length() && !isLetter(s.charAt(i))) {
	        latin = latin + s.charAt(i);
	        i++;
	      }

	      // If there aren't any words left, stop.
	      if (i>=s.length()) break;

	      // Otherwise we're at the beginning of a word.
	      int begin = i;
	      while (i<s.length() && isLetter(s.charAt(i))) {
	        i++;
	      }

	      // Now we're at the end of a word, so translate it.
	      int end = i;
	      latin = latin + pigWord(s.substring(begin, end));
	    }
	    return latin;
	  }

	  /**
	   * Method to find the index of the first vowel in a word.
	   * @param word The word to search
	   * @return The index of the first vowel
	   */
	  private static int firstVowel(String word) {
	    word = word.toLowerCase();
	    for (int i=0; i<word.length(); i++)
	      if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
	          word.charAt(i)=='i' || word.charAt(i)=='o' ||
	          word.charAt(i)=='u')
	        return i;
	    return 0;
	  }
	
		
	}

	 



