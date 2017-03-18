package tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by wangyun on 17/3/18.
 */
public class ArrayBinaryTree<T> implements BinaryTree<T> {

    private int count;
    private int capacity;
    private Class<T> type;
    private T[] tree;

    public ArrayBinaryTree(Class<T> type) {
        this.count = 0;
        this.tree = (T[]) Array.newInstance(type, 100);
        this.capacity = 100;
        this.type = type;
    }

    public ArrayBinaryTree(Class<T> type, int capacity) {
        this.count = 0;
        if (capacity <= 0) {
            capacity = 100;
        }
        this.capacity = capacity;
        this.type = type;
        this.tree = (T[]) Array.newInstance(type, capacity);
    }

    public ArrayBinaryTree(Class<T> type, T element) {
        this.count = 0;
        this.tree = (T[]) Array.newInstance(type, 100);
        this.capacity = 100;
        this.type = type;
        this.tree[0] = element;
    }


    public void expandCapacity() {
        T[] temp = (T[])Array.newInstance(this.type, this.capacity * 2);
        for (int i = 0; i < tree.length; i++) {
            temp[i] = tree[i];
        }

        tree = temp;
    }

    @Override
    public T find(T target) {
        T temp = null;

        for (int i = 0; i < tree.length ; i++) {
            if (target.equals(tree[i])) {
                temp = tree[i];
                break;
            }
        }
        return temp;
    }

    @Override
    public boolean contains(T target) {
        boolean contain = false;
        for (int i = 0; i < tree.length; i++) {
            if (target.equals(tree[i])) {
                contain = true;
                break;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iteratorInOrder() {
        ArrayList<T> list = new ArrayList<T>();
        inOrder(0, list);

        return list.iterator();
    }

    private void inOrder(int index, ArrayList<T> list) {
        if (index < tree.length && tree[index] != null) {
            inOrder(2 * index + 1 , list);
            int rear = list.size();
            list.add(rear, tree[index]);
            inOrder(2 * (index + 1), list);
        }
    }

    @Override
    public Iterator<T> iteratorPreOrder() {
        ArrayList<T> list = new ArrayList<T>();
        preOrder(0, list);
        return list.iterator();
    }

    private void preOrder(int index, ArrayList<T> list) {
        if (index < tree.length && tree[index] != null) {
            list.add(tree[index]);
            preOrder(2 * index + 1, list);
            preOrder(2 * (index + 1), list);
        }
    }

    @Override
    public Iterator<T> iteratorPostOrder() {
        ArrayList<T> list = new ArrayList<T>();
        postOrder(0, list);
        return list.iterator();
    }

    private void postOrder(int index, ArrayList<T> list) {
        if (index < tree.length && tree[index] != null) {
            postOrder(2 * index + 1, list);
            postOrder(2 * (index + 1), list);
            list.add(tree[index]);
        }
    }
}
