/** 
	this is actually Task02
*/

import java.util.Scanner;

public class Task01 {

	public static void main(String [] args) {
		
		char c = args[0].charAt(0);
		String s = args[1];
		
		boolean flag = false;
		
		for (int i = 0; i < s.length() && !flag; i++) {			
		
			flag = (s.charAt(i) == c);
			
		}
		
		System.out.println(flag);
		
	}

}