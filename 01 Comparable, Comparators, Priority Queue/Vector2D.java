import java.util.*;

public class Vector2D implements Comparable<Vector2D> {

	private double x, y;
	public double getX() { return x; }
	public double getY() { return y; }
	public void setX(double x) { this.x = x; }
	public void setY(double y) { this.y = y; }
	
	public double length() {
		return Math.sqrt(x * x + y * y);
	}
	
	public int compareTo(Vector2D v) {
		return (int) (this.length() - v.length());
	}
	
	
	public Vector2D(double x, double y) {
		System.out.println("creating vector");
		this.x = x;
		this.y = y;
	}
	
	public Vector2D() {
		this(0.0, 0.0);
	}
	
	public String toString() {
		return "<" + x + ", " + y + ">";
	}
	
	public Vector2D add(Vector2D v) {
		return new Vector2D(this.x + v.getX(), this.y + v.getY());
	}
	

	public static void main(String [] args) {
		
		ArrayList<Vector2D> a = new ArrayList<>();
		a.add(new Vector2D(3, 1));
		a.add(new Vector2D(0, 10));
		a.add(new Vector2D(2, 5));
		
		
		//Collections.sort(a);
		
		Collections.sort(a, new Comparator<Vector2D>()
							{
								public int compare(Vector2D v1, Vector2D v2) {
									return (int)(v1.getX() - v2.getX());
								}
							});
							
		System.out.println(a);
		
	}

}