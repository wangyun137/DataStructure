package design.adapter;

/**
 * Created by wangyun on 17/3/18.
 */
public class ConcreteTarget implements Target{

    @Override
    public void request() {
        System.out.println("ConcreteTarget request");
    }
}
