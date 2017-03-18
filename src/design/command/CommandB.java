package design.command;

/**
 * Created by wangyun on 17/3/17.
 */
public class CommandB extends Command{
    public CommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
