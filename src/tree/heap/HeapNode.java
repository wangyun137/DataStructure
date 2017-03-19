package tree.heap;

import tree.BinaryTreeNode;

/**
 * Created by wangyun on 17/3/19.
 */
public class HeapNode<T> extends BinaryTreeNode<T> {

    public HeapNode<T> parent;

    public HeapNode(T element) {
        super(element);
        parent = null;
    }
}
