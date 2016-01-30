package level1;

public class testing {

	public static void main(String[] args) {
		testing m = new testing();
	}

	testing(){repeat(52);}
	
	void repeat(int x){
	int y = x%2;
		if( y == 1){
			System.out.println("odd");
		}
		else{
			System.out.println("even");
		}
		
		
	}
	

}
