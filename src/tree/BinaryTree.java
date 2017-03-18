package tree;

import java.util.Iterator;

/**
 * Created by wangyun on 17/3/18.
 */
public interface BinaryTree<T> {
    T find(T target);

    boolean contains(T target);

    Iterator<T> iteratorInOrder();

    Iterator<T> iteratorPreOrder();

    Iterator<T> iteratorPostOrder();
}
