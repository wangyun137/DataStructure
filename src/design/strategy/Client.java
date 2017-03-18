package design.strategy;

/**
 * Created by wangyun on 17/3/18.
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy();

        Context context = new Context(strategy);

        context.doAnything();
    }
}
