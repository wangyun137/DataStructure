package design.factory;

/**
 * Created by wangyun on 17/3/16.
 */
public class ProductCreator extends Creator{

    @Override
    public <T extends Product> T create(Class<T> type) {
        Product product = null;
        try {
            product = (Product)Class.forName(type.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
