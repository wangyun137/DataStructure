package design.command;

/**
 * Created by wangyun on 17/3/17.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new ReceiverA();
        Command command = new CommandA(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
