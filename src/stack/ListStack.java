package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by wangyun on 16-11-15.
 */
public class ListStack<T> implements Stack<T>{

    public List<T> stackList;

    public ListStack() {
        stackList = new ArrayList<>();
    }

    @Override
    public void push(T element) {
        stackList.add(element);
    }

    @Override
    public T pop() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.remove(stackList.size() - 1);
    }

    @Override
    public T peek() {
        return stackList.get(stackList.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

}


