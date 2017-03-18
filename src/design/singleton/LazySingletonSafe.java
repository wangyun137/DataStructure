package design.singleton;

/**
 * Created by wangyun on 17/3/16.
 */
public class LazySingletonSafe {
    private static LazySingletonSafe sInstance;

    private LazySingletonSafe() {}

    public static synchronized LazySingletonSafe getInstance() {
        if (sInstance == null) {
            sInstance = new LazySingletonSafe();
        }
        return sInstance;
    }
}
