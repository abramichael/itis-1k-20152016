import java.io.*;

public class Main {

	public static void main(String [] args) throws IOException {
			
		SuperScanner sc = new SuperScanner("in.txt");
		
		// считывает до нажатия клавиши enter
		
		IntArray a = sc.nextIntArray();
		System.out.println(a);
		
	
	}

}