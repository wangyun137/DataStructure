package design.adapter;

/**
 * Created by wangyun on 17/3/18.
 */
public class ConcreteAdapter extends BaseAdapter implements Target{
    @Override
    public void doSomething() {
        System.out.println("ConcreteAdapter doSomething");
    }

    @Override
    public void request() {
        this.doSomething();
    }
}
