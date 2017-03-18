package design.mediator;

/**
 * Created by wangyun on 17/3/17.
 */
public class ColleaguaA extends Colleague{
    public ColleaguaA(Mediator mediator) {
        super(mediator);
    }

    public void methodA() {
        mediator.doSomethingA();
    }
}
