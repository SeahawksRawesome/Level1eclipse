package level1;

public class PetPlatypus {
	private String name;

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus. He is Supa SMart. Watch, he can spell: HIgh. I Iz Da Plertypurse. I Iz Veery Smurt. I Knowz Whuat Juan Plus JOU Iz. Iz Juan. DErp Derp Derp! Ferm- JimmiehBOI!!!");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		PetPlatypus JimmeihBOI = new PetPlatypus();
		//2. Call the sayHi method
		JimmeihBOI.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		PetPlatypus m = new PetPlatypus();
	}
	PetPlatypus(){
		name = "JimmiehBOI";
	}
}


