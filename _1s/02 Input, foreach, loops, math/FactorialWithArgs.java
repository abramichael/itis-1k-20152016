
public class FactorialWithArgs	 {
	
	public static void main(String [] args) {
		
		int n = Integer.parseInt(args[0]);
		
		int p = 1;
		for (int i = 1; i <= n; i++)
			p *= i;
			
		System.out.println(p);

	}

}