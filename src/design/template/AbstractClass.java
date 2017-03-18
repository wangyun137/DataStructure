package design.template;

/**
 * Created by wangyun on 17/3/17.
 */
public abstract class AbstractClass {
    protected abstract void doSomething();

    protected abstract void doAnything();

    public void templateMethod() {
        doSomething();

        doAnything();
    }
}
