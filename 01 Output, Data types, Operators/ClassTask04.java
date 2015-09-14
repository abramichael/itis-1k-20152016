public class ClassTask04 {
	
	public static void main(String [] args) {
		boolean p = true;
		boolean q = false;
		
		System.out.println(2 > 1);
		q = 2 < 1;
		System.out.println(q);
		
		int x = -10;
		int y;
		// condition always in brackets
		if (x > 0)
			y = 1;
		else if (x < 0)
			y = -1;
		else
			y = 0;
		
		x = 5;
		//постфиксный инкремент
		//сначала присваивание, потом увеличение x
		a = x++;
		//префиксный инкремент
		//сначала увеличение x, потом присваивание
		a = ++x;
	}
	
}