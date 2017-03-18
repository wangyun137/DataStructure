package design.observer;

/**
 * Created by wangyun on 17/3/18.
 */
public class ConcreteSubject extends Subject{
    public void doSomething() {
        super.notifyObserver();
    }
}
