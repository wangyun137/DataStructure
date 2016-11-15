package stack;

/**
 * Created by wangyun on 16-11-15.
 */
public interface Stack<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();

}
