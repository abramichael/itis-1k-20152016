/**
 * Created by ma on 04.12.2015.
 */
public class SmartPhone03 extends Phone implements CanMakePhoto {
    @Override
    public void makePhoto() {
        System.out.println("Ok, I am phone but i can make photo.");
    }
    //makeCall is inherited from Phone, don't need to implement it.
}
