import java.util.Arrays;

public class SumWithArgs {
	
	public static void main(String [] args) {
		int s = 0;
		//for (int i = 0; i < args.length; i++) 
		for (String x : args) {
			//s += Integer.parseInt(args[i]);
			s += Integer.parseInt(x);
		}
		
		System.out.println(s);
		System.out.println(Arrays.toString(args));
	}
	
}