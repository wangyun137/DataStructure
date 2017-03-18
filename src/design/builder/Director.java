package design.builder;

/**
 * Created by wangyun on 17/3/17.
 */
public class Director {
    public Builder builder = new ConcreteBuilder();

    public Product getProduct() {
        builder.setAttribute();
        return builder.buildProduct();
    }
}
