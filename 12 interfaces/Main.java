/**
 * Created by ma on 04.12.2015.
 */
public class Main {
    public static void main(String[] args) {

        //Phone p = new Phone();
        //p = new DiskPhone(); - wrong,
        // because p - Diskphone is not Phone

        CanCall p = new Phone();
        p = new DiskPhone(); // correct,
        // because p Diskphone is CanCall
        p = new SmartPhone01();

        CanMakePhoto cam = new Camera();

        Human human = new Human();
        human.makeCall(p);
        human.makePhoto(cam);

        //SmartPhone01 sp = new SmartPhone01(); - OK
        //SmartPhone02 sp = new SmartPhone02(); - OK
        SmartPhone03 sp = new SmartPhone03();
        human.makePhoto(sp);
        human.makeCall(sp);
        
        //final static for Oleg!
        System.out.println(CanCall.FOR_OLEG);
        System.out.println(sp.FOR_OLEG);

    }
}
