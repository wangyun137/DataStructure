package design.composite;

/**
 * Created by wangyun on 17/3/18.
 */
public class Client {
    public static void main(String[] args) {
        Branch root = new Branch();
        root.doSomething();

        Branch branch = new Branch();
        Component leaf = new Leaf();
        branch.add(leaf);
        root.add(branch);
    }

    public static void display(Branch root) {
        for (Component c : root.getChildren()) {
            if ( c instanceof Leaf) {
                c.doSomething();
            } else {
                display((Branch)c);
            }
        }
    }
}
