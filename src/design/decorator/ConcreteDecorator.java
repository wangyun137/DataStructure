package design.decorator;

/**
 * Created by wangyun on 17/3/18.
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        this.decorator();
        super.operate();
    }

    private void decorator() {
        System.out.println("ConcreteDecorator decorator");
    }
}
