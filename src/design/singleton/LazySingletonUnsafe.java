package design.singleton;

/**
 * Created by wangyun on 17/3/16.
 */
public class LazySingletonUnsafe {
    private static LazySingletonUnsafe sInstance;

    private LazySingletonUnsafe(){}

    public static LazySingletonUnsafe getInstance() {
        if (sInstance == null) {
            sInstance = new LazySingletonUnsafe();
        }

        return sInstance;
    }
}
