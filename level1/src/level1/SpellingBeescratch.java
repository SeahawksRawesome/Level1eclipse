package level1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class SpellingBeescratch {
	int lines;
	ArrayList<String> words = new ArrayList<>();

	/*
	 * Get a random word using the randomWord() method and ask the user how to
	 * spell it using the speak() method. If the user spells it right move on to
	 * a new word, but if they do not spell it right ask again. The only place
	 * that you need to write code in is the stuffForYouToDo() Method
	 */
	public void stuffForYouToDo() {
		
		String word = randomWord();
		Speak(word);
		System.out.println(word);
		String answer = JOptionPane.showInputDialog("WHat did the computer say? If it is hard, you can have the word for free:" + randomWord());
		if(answer.equals(word)){
			Speak("U Did it. U Got E. Nice Jerb. WHoo Hoo. U just Juan. We tryed to trick you by puttinh a fake word. Hahahahahaha! I Iz Glads dat u got ee, 360 no scoped, 24 blaze itededdede");
		
		}
		else{
			Speak("Ha, Got E. We tricked u soooo Hard!!! That was not the word! Get TROLLLLLLLLLLEDDDDDDD!!! DErp DErp Depr DERRRPPPPPPP!!!!");
		}
	}

	public String randomWord() {
		return words.get(new Random().nextInt(lines));
	}

	public SpellingBeescratch() {
		System.out.println(" /--------------------------------------------\\ ");
		System.out.println(" | Warning: Some of the words are super hard! | ");
		System.out.println(" \\--------------------------------------------/ ");
		try {
			// Get the amount of lines
			LineNumberReader lnr = new LineNumberReader(new FileReader(new File("/usr/share/dict/words")));
			lnr.skip(Long.MAX_VALUE);// Skip to the end
			lines = lnr.getLineNumber();// Get last line number
			
			System.out.println("Number of words: " + lines);
			lnr.close();
			BufferedReader br = new BufferedReader(new FileReader(new File("/usr/share/dict/words")));
			for (int i = 0; i < lines; i++) {
				words.add(br.readLine()); // adds every line to the array
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		stuffForYouToDo();
	}

	public static void main(String[] args) {
		new SpellingBeescratch();
	}

	public void Speak(String text) {
		try {
			Runtime.getRuntime().exec("say " + text).waitFor();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}

	public void speakNoWait(String text) {
		try {
			Runtime.getRuntime().exec("say " + text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


