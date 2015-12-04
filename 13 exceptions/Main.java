import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ma on 04.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        int [] a = new int[10];
        try {
            int m = 5;
            int n = 9;
            int f = MyMath.fact(m);
            a[n] = f;
            System.out.println(f);
            Scanner sc = new Scanner(new File("in.txt"));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry, check array index.");
        } catch (FactorialException e) {
            System.out.println("Factorial argument should be >= 0");
        } catch (FileNotFoundException e) {
            System.out.println("No such file");
        } finally {
            System.out.println("I am executed.");
        }

    }
}
