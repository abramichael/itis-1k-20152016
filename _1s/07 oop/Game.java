import java.util.Scanner;

public class Game {
	private Player p1, p2;
	
	public Game() {
		Scanner scanner = new Scanner(System.in);
		p1 = new Player(scanner.nextLine());
		p2 = new Player(scanner.nextLine());
	}
	
	public void run() {
		while (p1.isAlive() && p2.isAlive()) {
			p1.kick(p2);
			if (p2.isAlive()) {
				p2.kick(p1);
			}
			System.out.println("====");
		}
	}
	
	public static void main(String [] args) {
		(new Game()).run();
	}
}