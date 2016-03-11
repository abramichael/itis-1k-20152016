/**
 * Created by ma on 04.12.2015.
 */

public class MyMath {

    public static int fact(int n) throws FactorialException {

        if (n < 0) {
            throw new FactorialException("Damn, no negative plz!");
        } else if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

}
