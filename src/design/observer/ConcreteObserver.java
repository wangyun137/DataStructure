package design.observer;

/**
 * Created by wangyun on 17/3/18.
 */
public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("ConcreteObserver receive the message");
    }
}
