package queue;

/**
 * Created by wangyun on 16-11-15.
 */
public interface Queue<T> {
    void insert(T value);
    T remove();
    boolean isFull();
    boolean isEmpty();
    int size();
}
