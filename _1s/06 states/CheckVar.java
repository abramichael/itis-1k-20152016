public class CheckVar {

	public static boolean isLetter(char c) {
		return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
	}

	public static boolean isDigit(char c) {
		return (c >= '0' && c <= '9');
	}

	
	public static void main(String [] args) {
	
		String input = args[0];
		//  1 accept
		// -1 reject
		//  0 - start
		byte state = 0;
		int i = 0;
		while (i < input.length() && state >= 0) {
			char c = input.charAt(i);
			switch(state) {
				case 0:
					if (c == '_' || isLetter(c)) {
						state = 1;
					}
					else {
						state = -1;
					}
					break;
				case 1:
					if (c == '_' || isLetter(c) || isDigit(c)) {
						state = 1;
					}
					else {
						state = -1;
					}
			}
			i += 1;
		}
		if (state == 1)
			System.out.println("Correct");
		else
			System.out.println("Not correct");
	}
}