package design.command;

/**
 * Created by wangyun on 17/3/17.
 */
public class CommandA extends Command{
    public CommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
