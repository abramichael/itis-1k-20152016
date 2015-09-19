public class MathExample {

	public static void main(String [] args) {
		
		double x= 21;
		double y;
		long c1 = System.nanoTime();
		y = x * x;
		System.out.println(System.nanoTime() - c1);
		
		c1 = System.nanoTime();
		y = Math.pow(x, 2);
		System.out.println(System.nanoTime() - c1);
		
		
	}

}