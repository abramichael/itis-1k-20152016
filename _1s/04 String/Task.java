import java.util.Scanner;

/**
 * Created by ma on 16.10.2015.
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
