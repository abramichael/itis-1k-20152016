/**
 * Created by ma on 27.11.2015.
 */
class Camera {}

public class SmartPhone extends Phone {
    private Camera camera;
    public SmartPhone(String model, int yearProduced, double price) {
        //setModel(model);
        super(model, yearProduced, price);
        this.camera = new Camera();
    }
    @Override
    public String toString() {
        return "Smart" + super.toString() + "with camera";
    }
}
