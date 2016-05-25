/**
 * Created by ma on 25.05.2016.
 */
public class Request {
    private int answer;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getArg() {
        return arg;
    }

    public void setArg(int arg) {
        this.arg = arg;
    }

    public Request(Client client, int arg) {
        this.client = client;
        this.arg = arg;
    }

    private Client client;
    private int arg;

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getAnswer() {
        return answer;
    }
}
