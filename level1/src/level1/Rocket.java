package level1;

public class Rocket {
	int fuel;
	String RocketName;
	 Rocket(int fuel, String RocketName){
		this.fuel = fuel;
		this.RocketName = RocketName;
		 
		 System.out.println("Constructing Rocket");
	 }
	 void Launch(){
		 for(int i = 0; i < fuel; fuel-- ){
			 System.out.println(fuel);
			 if(fuel == 1){
				 System.out.println("Out of Fuel");
			 }
		 }
	 }
	 void refuel(int fuel){
		 this.fuel = fuel;
	 }
	 boolean canMakeIt( int Distance) {
		if(fuel > Distance){
			System.out.println("true");
		return	true;
		
		}
		else{
			System.out.println("false");
			return false;
			
		}
		 
	 }
}
