package tree;

import java.lang.Math;

/**
 * Created by wangyun on 17/3/18.
 */
public class BinaryTreeNode<T> {
    public T element;

    public BinaryTreeNode left, right;

    public BinaryTreeNode(T element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public int numChildren() {
        int childrenCount = 0;

        if (left != null) {
            childrenCount = 1 + left.numChildren();
        }

        if (right != null) {
            childrenCount = childrenCount + 1 + right.numChildren();
        }

        return childrenCount;
    }

    public int getHeight(int numChildren) {
        return (int)(Math.log(numChildren) / Math.log(2));
    }
}

