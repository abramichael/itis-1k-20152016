package ru.kpfu.itis.group501;

public class IntArray {

	private int [] array;
	
	public IntArray(int [] ar) {
		array = ar;
	}

	public String toString() {
		String s = "";
		for (int x : array) {
			s += x + " ";
		}
		return s;
	}
	
	public void setLength(int n) {
		int [] new_array = new int[n];
		int i = 0;
		while (i < n && i < array.length) {
			new_array[i] = this.array[i];
			i++;
		}
		this.array = new_array;
	}

	public static void main(String []args) {
		IntArray ia = new IntArray(new int[]{1,2});
		System.out.println(ia);
	}
	

}