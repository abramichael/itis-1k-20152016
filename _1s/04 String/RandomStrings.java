import java.util.Random;

public class RandomStrings {

	public static void main(String [] args) {
	
		final int N = 100;
		String [] strings = new String[N];
		char c;
		Random r = new Random();

		for (int i = 0; i < N; i++) {
			
			// генерирую рандомную длину
			int len = r.nextInt(20) + 1;
			// генерирую рандомные символы
			String s = "";
			for (int j = 0; j < len; j++) {
				
				//генерация рандомного символа c
				c = (char) ('a' + r.nextInt(26));
				s += c;
			
			}

			strings[i] = s;
		
		}
		
		for (int i = 0; i < N; i++)
			System.out.println(strings[i]);
		
	
	}

}