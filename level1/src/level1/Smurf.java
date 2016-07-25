package level1;

// Copyright Wintriss Technical Schools 2013
/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("The Name's " + name + "   " + name + " Smurf.");
		return "The Name's " + name + "   " + name + " Smurf.";
		
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Posinous Trubbishes.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if(name.equals("Perpe")){
			System.out.println(name + " You have a Rerddd hurttt!");
			return "Red";
		}
		else{
			System.out.println(name + " You iz da Wite hurtss. Got EEEE?");
			return "White";
		}
		// 3. Fill in this method
		
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if(name.equals("Smeurrfaett")){
			System.out.println( name + " You iz da Girrlllllllellllz");
			return "Gerrrl";
		}
		else{
			System.out.println( name + " You iz da BOIIIII. ohhhhh..... kayyy!");
			return "Boi";
		}
	}

}




