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

}