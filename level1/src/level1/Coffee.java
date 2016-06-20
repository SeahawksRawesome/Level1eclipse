package level1;

import javax.swing.JOptionPane;

public class Coffee {

	public static void main(String[] args) {
 Coffee yum = new Coffee();
		

	}
	Coffee(){
	Name();
	Take(2);
	Stringy("Bill");
	int x = minus(5, 2);
	System.out.println(x);
	x = minus(4, 3);
	System.out.println(x);
	System.out.println(rs(3));
	}
	void Name(){
		System.out.println("Brandon");
		
	}
	void Take(int numba_of_timez){
				for(int i = 0; i < numba_of_timez; i++){
					System.out.println("billeh");
				}
	}
	void Stringy(String print){
	System.out.println(print);
}
	int minus(int numba1, int numba2){
		int x = numba1 - numba2;
		return x;
		
	}
	String rs(int myne){
		if(myne == 3){
			String y = "illuminati";
			return y;
		}
		else{
			String x = myne + " days away from eating swedish smish";
			
			return x;
		}
	
	}
}