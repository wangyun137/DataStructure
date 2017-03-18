package design.command;

/**
 * Created by wangyun on 17/3/17.
 */
public abstract class Command {
    public abstract void execute();

    protected Receiver receiver;

}
