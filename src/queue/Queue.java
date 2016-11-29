package queue;

/**
 * Created by wangyun on 16-11-15.
 */
public interface Queue<T> {
    void enqueue(T value);
    T dequeue();
    boolean isFull();
    boolean isEmpty();
    int size();
}
