package design.mediator;

/**
 * Created by wangyun on 17/3/17.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
