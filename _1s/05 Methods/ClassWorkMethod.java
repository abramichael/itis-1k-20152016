public class ClassWorkMethod {

	public static int factorial(int x) {
		int p = 1;
		for (int i = 1; i <= x; i++) {
			p *= i;
		}
		return p;
	}
	
	public static void sop(Object o) {
		System.out.println(o);
	}
	
	public static int read(String [] args, int i) {
		return Integer.parseInt(args[i]);
	}
	
	public static boolean isEven(int x) {
		return (x % 2 == 0);
	}
	
	public static boolean hasEven(int [] array) {	
		for (int element : array)
			if (isEven(element))
				return true;
		return false;
	}
			
	public static int fib(int n) {
		System.out.println(n);
		if (n == 1 || n == 2)
			return 1;
		else
			return fib(n-1) + fib(n-2);
			
	}
		
	public static int fact2(int n) {
		if (n > 0)
			return fact2(n-1) * n;
		else
			return 1;
	}
		

	public static int max(int a, int b) {
		return (a > b ? a : b);
	}
	
	public static int max(int a, int b, int c) {
		return max(a, b) > c ? max(a, b) : c;
	}
	
		
	public static void main(String [] args) {
	
		System.out.println(max(1,2,1));
		System.out.println(max(1,10));
		
		//int [] a = new int[]{1,6,3,8,3,7,2,7};
		/*
		int n = 100;
		int [] a = new int[n];
		randomFill(a);
		System.out.println(hasEven(a));
		*/

		/*
		int y = fact2(10);
		sop(y);
		*/
		
		sop(fib(15));
		
	}

}