import java.util.Scanner;

public class FactorialWithScanner {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int p = 1;
		for (int i = 1; i <= n; i++)
			p *= i;
		System.out.println(p);
		sc.close();
	}

}