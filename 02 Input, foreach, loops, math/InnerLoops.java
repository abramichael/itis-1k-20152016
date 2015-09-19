import java.util.*;
public class InnerLoops {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long s = 0;
		long c1 = System.nanoTime();
		long p = 1;
		for (int k = 1; k <= n; k++) {		
			p *= k;
			s += p;
		}
		System.out.println(s);
		System.out.println("TIME: " + (System.nanoTime() - c1));
	}
}