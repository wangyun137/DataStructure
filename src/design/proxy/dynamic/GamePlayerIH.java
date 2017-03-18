package design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wangyun on 17/3/17.
 */
public class GamePlayerIH implements InvocationHandler{

    private Object obj;

    public GamePlayerIH(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }

        this.obj = obj;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = method.invoke(this.obj, objects);
        return result;
    }
}
