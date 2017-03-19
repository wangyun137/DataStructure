package tree.heap;

/**
 * Created by wangyun on 17/3/19.
 */
public interface HeapADT<T> {
    void addElement(T element);

    T removeMin();

    boolean isEmpty();
}
