public class ClassTask03 {
	
	public static void main(String [] args) {
		long secondsInDay = 24 * 60 * 60;
		System.out.println(secondsInDay);
		long millisecondsInDay = 24 * 60 * 60 * 1000;
		System.out.println(millisecondsInDay);
		long microsecondsInDay = 24 * 60 * 60 * 1000 * 1000L;
		System.out.println(microsecondsInDay);
		//need L for 24 to make the result actually long from the 1st argument
		long nanosecondsInDay = 24L * 60 * 60 * 1000 * 1000 * 1000;
		System.out.println(nanosecondsInDay);
	}
	
}