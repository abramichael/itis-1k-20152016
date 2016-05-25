/**
 * Created by ma on 25.05.2016.
 */
public class Client extends Thread {
    private Service service;
    private int arg;
    private Request request;

    public Client(Service service, int arg) {
        this.service = service;
        this.arg = arg;
    }

    public void run() {
        System.out.println("Sending request with arg: " + arg);
        try {
            service.saveRequest(this, arg);
            synchronized (request) {
                request.wait();
                System.out.println("Got from service: " + request.getAnswer());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setAnswer(int answer) {
        this.request.setAnswer(answer);
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
