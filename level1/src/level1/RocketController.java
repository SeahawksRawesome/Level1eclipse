package level1;

public class RocketController {
	
	public static void main(String [] args){
		Rocket m = new Rocket(20, "joe");
		m.Launch();
		m.refuel(20);
		m.canMakeIt(15);
	}
}
