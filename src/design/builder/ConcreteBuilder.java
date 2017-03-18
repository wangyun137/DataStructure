package design.builder;

/**
 * Created by wangyun on 17/3/17.
 */
public class ConcreteBuilder extends Builder{

    @Override
    public void setAttribute() {
        System.out.println("ConcreteBuilder setAttribute");
    }

    @Override
    public Product buildProduct() {
        return new Product();
    }
}
