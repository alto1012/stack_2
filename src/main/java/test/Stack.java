package test;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> stackList;

    public void SimpleStack() {
        stackList = new ArrayList<>();
    }


    public void push(T item) {
        stackList.add(item);
    }


    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stackList.remove(stackList.size() - 1);
    }


    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stackList.get(stackList.size() - 1);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }


    public int size() {
        return stackList.size()-1;
    }
}
