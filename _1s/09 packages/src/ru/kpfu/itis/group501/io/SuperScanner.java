package ru.kpfu.itis.group501.io;

import java.io.*;
import java.util.Scanner;

import ru.kpfu.itis.group501.IntArray;

public class SuperScanner {

	private Scanner sc;
	public SuperScanner() {
		sc = new Scanner(System.in);
	}

	public SuperScanner(String filename) throws IOException {
		sc = new Scanner(new File(filename));
	}
	
	public IntArray nextIntArray() {		
		String line = sc.nextLine();
		String [] strings = line.split(" ");
		
		int [] result = new int[strings.length];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = Integer.parseInt(strings[i]);
		}
		
		return new IntArray(result);
		
	}

}