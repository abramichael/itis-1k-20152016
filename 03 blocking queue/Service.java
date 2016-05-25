import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by ma on 25.05.2016.
 */
public class Service extends Thread{
    private BlockingQueue<Request> bq = new LinkedBlockingQueue<>();
    public int calculateAnswer(int arg) {
        return arg * arg;
    }
    public void run() {
        while (true) {
            try {
                Request r = bq.take();
                synchronized (r) {
                    int answer = calculateAnswer(r.getArg());
                    r.getClient().setAnswer(answer);
                    r.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveRequest(Client c, int arg) throws InterruptedException {
        Request r = new Request(c, arg);
        bq.put(r);
        c.setRequest(r);

    }
}
