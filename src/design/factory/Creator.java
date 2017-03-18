package design.factory;

/**
 * Created by wangyun on 17/3/16.
 */
public abstract class Creator {
    public abstract <T extends Product> T create(Class<T> type);
}
