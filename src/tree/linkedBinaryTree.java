package tree;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by wangyun on 17/3/18.
 */
public class LinkedBinaryTree<T> implements BinaryTree<T>{
    private int count;
    private BinaryTreeNode<T> root;

    public LinkedBinaryTree() {
        count = 0 ;
        root = null;
    }

    public LinkedBinaryTree(T element) {
        count = 0;
        root = new BinaryTreeNode<T>(element);
    }

    public void setRoot(BinaryTreeNode<T> root) {
        if (root != null) {
            this.root = root;
        }
    }

    @Override
    public T find(T element) {
        if (root == null) {
            throw new NullPointerException("root is null");
        }
        BinaryTreeNode<T> current = findAgain(element, root);

        return current.element;

    }

    @Override
    public boolean contains(T element) {
        if (root == null) {
            throw new NullPointerException("root is null");
        }

        BinaryTreeNode<T> current = findAgain(element, root);

        return current == null;
    }

    private BinaryTreeNode findAgain(T element, BinaryTreeNode<T> next) {
        if (next == null) {
            throw new NullPointerException("BinaryTreeNode next is null");
        }

        if (next.element.equals(element)) {
            return next;
        }

        BinaryTreeNode<T> temp = findAgain(element, next.left);

        if (temp == null) {
            temp = findAgain(element, next.right);
        }

        return temp;
    }

    @Override
    public Iterator<T> iteratorInOrder() {
        ArrayList<T> list = new ArrayList<T>();
        inOrder(root, list);

        return list.iterator();
    }

    private void inOrder(BinaryTreeNode<T> node, ArrayList<T> list) {
        if (node != null) {
            inOrder(node.left, list);
            int rear = list.size();
            list.add(rear, node.element);
            inOrder(node.right, list);
        }
    }

    @Override
    public Iterator<T> iteratorPreOrder() {
        ArrayList<T> list = new ArrayList<T>();
        preOrder(root, list);

        return list.iterator();
    }

    private void preOrder(BinaryTreeNode<T> node, ArrayList<T> list) {
        if (node != null) {
            list.add(node.element);
            preOrder(node.left, list);
            preOrder(node.right, list);
        }
    }

    @Override
    public Iterator<T> iteratorPostOrder() {
        ArrayList<T> list = new ArrayList<T>();
        postOrder(root, list);

        return list.iterator();
    }

    private void postOrder(BinaryTreeNode<T> node, ArrayList<T> list) {
        if (node != null) {
            postOrder(node.left, list);
            postOrder(node.right, list);
            list.add(node.element);
        }
    }


}
