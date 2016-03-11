
public class Human {
    private Phone phone;
    private String name;
    public Human(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public void callSomebody(Human h) {
        System.out.println(this.name + " is calling to " + h.name);
        this.phone.call();
        if (this.phone instanceof SmartPhone) {
            System.out.println("This is SMARTPhone btw.");
            SmartPhone sp = (SmartPhone) this.phone;
            sp.makePhoto();
        }
    }

}
