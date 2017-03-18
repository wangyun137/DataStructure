package design.singleton;

/**
 * Created by wangyun on 17/3/16.
 */
public class GeneralSingleton {
    public static final GeneralSingleton INSTANCE = new GeneralSingleton();

    private GeneralSingleton(){}

    public static GeneralSingleton getInstance() {
        return INSTANCE;
    }
}
