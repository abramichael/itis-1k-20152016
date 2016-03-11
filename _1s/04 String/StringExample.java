/**
 * Created by ma on 16.10.2015.
 */
public class StringExample {
    public static void main(String[] args) {
        String s1 = "Marat";
        String s2 = "Oleg";
        String s3 = "Sveta";

        System.out.println(s1.equals(s2));
        // check if negative or positive value
        System.out.println(s1.compareTo(s2));
        System.out.println(s3.compareTo(s2));

        System.out.println(s1.startsWith("Ma"));
        System.out.println(s1.endsWith("Ma"));

        String s4 = "Marat is sitting with Sagit.";
        System.out.println(s4.indexOf('t', 13));
        System.out.println(s4.lastIndexOf('t'));

        System.out.println(s4.indexOf("abc"));

        System.out.println("ab5ab10".replace("ab", "cd"));

        String [] names = "Sagit Danil Leysan Kostya".split("a");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("abc".hashCode());
        System.out.println(System.out.hashCode());

    }
}
