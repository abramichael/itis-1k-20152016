public class ClassTask02 {
	
	public static void main(String [] args) {
		int x = 2;
		int y = 3;
		int z = y / x;
		System.out.println(z);
		byte b1 = (byte) 100;
		byte b2 = (byte) 50;
		byte b3 = (byte) (b1 + b2);
		System.out.println(b3);
		
		int n = 15;
		// integer division
		double q = 1.0 / n;
		System.out.println(q);
		int m = 10;
		double p = (float) m / n;
		
		//convert double to int
		p = 2.7;
		x = (int) p; // 2

		long s = 100L;
		float f = 20f;
		
		// 0.000000001;
		q = 21e-9;
		System.out.println(q);
		
	}
	
}