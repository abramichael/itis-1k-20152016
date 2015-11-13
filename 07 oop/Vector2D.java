public class Vector2D {

	private double x, y;
	public double getX() { return x; }
	public double getY() { return y; }
	public void setX(double x) { this.x = x; }
	public void setY(double y) { this.y = y; }
	
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
		/*
		Vector2D v1 = new Vector2D();
		v1.setX(1.5);
		v1.setY(0.5);
		*/
		Vector2D v1 = new Vector2D(1.5, 0.5);
		Vector2D v2 = new Vector2D(1.5, 0.5);
		
		System.out.println(v1);
		System.out.println(v2);
		
		Vector2D v3 = v1.add(v2); // v1 + v2
		System.out.println(v3);
		
	}

}