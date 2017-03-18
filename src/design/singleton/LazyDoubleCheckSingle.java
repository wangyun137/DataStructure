package design.singleton;

/**
 * Created by wangyun on 17/3/16.
 */
public class LazyDoubleCheckSingle {
    private static volatile LazyDoubleCheckSingle sInstance;

    private LazyDoubleCheckSingle() {}

    public static LazyDoubleCheckSingle getInstance() {
        if (sInstance == null) {
            synchronized (LazyDoubleCheckSingle.class) {
                if (sInstance == null) {
                    sInstance = new LazyDoubleCheckSingle();
                }
            }
        }

        return sInstance;
    }
}
