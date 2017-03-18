package design.builder;

/**
 * Created by wangyun on 17/3/17.
 */
public class ConcreteBuilder extends Builder{

    private Product product = new Product();

    @Override
    public void setAttribute() {
        //we can set the product attribute here
        System.out.println("ConcreteBuilder setAttribute");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
