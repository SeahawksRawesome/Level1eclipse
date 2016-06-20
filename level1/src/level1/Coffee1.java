package level1;

public class Coffee1 {
int temperature;
	public static void main(String[] args) {
Coffee1 real = new Coffee1(2);
real.brew();
	}
	Coffee1(int temp){
		this.temperature = temp;
		
	}
	void brew(){
		temperature = 110;
		System.out.println("the coffee is ready at " + temperature + " degrees");
	}
}
