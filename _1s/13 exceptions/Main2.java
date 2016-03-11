import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ma on 04.12.2015.
 */
public class Main2 {
    public static void main(String[] args) throws FactorialException, FileNotFoundException {
        int[] a = new int[10];

        int m = 5;
        int n = 0;
        int f = MyMath.fact(m);
        a[n] = f;
        int c = m / n;
        System.out.println(f);
        Scanner sc = new Scanner(new File("in.txt"));


    }
}
