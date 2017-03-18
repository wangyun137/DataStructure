package design.mediator;

/**
 * Created by wangyun on 17/3/17.
 */
public class ColleaguaB extends Colleague{
    public ColleaguaB(Mediator mediator) {
        super(mediator);
    }

    public void methodB() {
        mediator.doSomethingB();
    }
}
