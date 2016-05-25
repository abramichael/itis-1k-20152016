import java.io.Serializable;

/**
 * Created by ma on 25.05.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        service.start();
        for (int i = 0; i < 10; i++) {
            Client c = new Client(service, i);
            c.start();
        }
    }
}
