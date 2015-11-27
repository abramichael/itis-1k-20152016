/**
 * Created by ma on 27.11.2015.
 */
public class Phone{
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYearProduced() {
        return yearProduced;
    }
    public void setYearProduced(int yearProduced) {
        this.yearProduced = yearProduced;
    }
    public Phone(String model, int yearProduced, double price) {
        this.model = model;
        this.yearProduced = yearProduced;
        this.price = price;
    }
    public Phone() {
    }

    protected String model;
    protected int yearProduced;
    protected double price;

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", yearProduced=" + yearProduced +
                ", price=" + price +
                '}';
    }

    public void call() {
        System.out.println("Calling as old phone");
    }

}
