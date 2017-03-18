package design.adapter;

/**
 * Created by wangyun on 17/3/18.
 */
public class Client {
    public static void main(String[] args) {
        //original target
        Target target = new ConcreteTarget();
        target.request();

        //adapter target
        Target adapter = new ConcreteAdapter();
        adapter.request();
    }
}
