import java.io.*;

import ru.kpfu.itis.group501.IntArray;
import ru.kpfu.itis.group501.io.SuperScanner;

public class Main {

	public static void main(String [] args) throws IOException {
			
		SuperScanner sc = new SuperScanner("in.txt");
		
		// считывает до нажатия клавиши enter
		
		IntArray a = sc.nextIntArray();
		System.out.println(a);
		a.setLength(2);
		System.out.println(a);
		
	
	}

}