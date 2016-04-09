import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by ma on 30.03.2016.
 */
public class Tree {
	// this is the root of my tree
    private Node root;

    public Tree(int n) {
        root = createTree(n);
    }

    private static Node createTree(int n) {
        if (n == 0)
            return null;

        Node r = new Node();
        r.setValue(n);
        int nl = n / 2;
        int nr = n - nl - 1;
        r.setLeft(createTree(nl));
        r.setRight(createTree(nr));
        return r;
    }
    public static void printTree(int n, Node p) {
        if (p != null) {
            printTree(n + 1, p.getRight());
            for (int i = 0; i < n; i++) {
                System.out.print("  ");
            }
            System.out.println(p.getValue());
            printTree(n + 1, p.getLeft());
        }
    }

    public void print() {
        printTree(0, root);
    }

    public static int n = 0;
    public static void enumerateDepthKLP(Node p) {
        if (p != null) {
            p.setValue(n++);
            enumerateDepthKLP(p.getLeft());
            enumerateDepthKLP(p.getRight());
        }
    }

    public static void main(String[] args) {
        Tree t = new Tree(15);
        //enumerateDepthKLP(t.getRoot());
        //t.enumerateBreadthLP();
        t.enumerateLP();
        t.print();
    }

    public void enumerateBreadthLP() {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int n = 0;
        while (!q.isEmpty()) {
            Node p = q.poll();
            p.setValue(n++);
            if (p.getLeft()!= null)
                q.offer(p.getLeft());
            if (p.getRight()!= null)
                q.offer(p.getRight());
        }
    }
    public void enumerateLP() {
        Stack<Node> st = new Stack<>();
        st.push(root);
        int n = 0;
        while (!st.isEmpty()) {
            Node p = st.pop();
            p.setValue(n++);
            if (p.getLeft()!= null)
                st.push(p.getLeft());
            if (p.getRight()!= null)
                st.push(p.getRight());
        }
    }


    public Node getRoot() {
        return root;
    }
}
