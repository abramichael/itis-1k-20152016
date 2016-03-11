import java.util.Scanner;

public class Player {
	private String name;
	private int hp = 40;
	private Scanner sc = new Scanner(System.in);
	
	public String getName() { return name; }
	public int getHP() { return hp; }
	public void decHP(int x) { 
		hp -= x; 
	}
	
	public Player(String name) {
		this.name = name;	
	}
	
	private double getPr(int x) {
		return 0.7 - (x - 1) * 0.6 / 8;
	}	
	
	public void kick(Player p) {
		System.out.print(this.name + ">");
		int x = sc.nextInt();
		double pr = this.getPr(x);
		if (Math.random() < pr) {
			System.out.println(name + " kicked " + p.getName());
			p.decHP(x);
			System.out.println(p.getName() + " hp is " + p.getHP());		
		}
		else {
			System.out.println("Missed");
		}
		
	}

	public boolean isAlive() {
		return hp > 0;
	}



}