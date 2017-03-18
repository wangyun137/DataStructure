package design.decorator;

/**
 * Created by wangyun on 17/3/18.
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decorator = new ConcreteDecorator(component);

        decorator.operate();
    }
}
