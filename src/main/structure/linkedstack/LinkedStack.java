package main.structure.linkedstack;

import java.util.LinkedList;

public class LinkedStack<T> {

    private final LinkedList<T> stack = new LinkedList<>();

    public void push(final T value) {
        this.stack.push(value);
    }

    public T pop() {
        return this.stack.pop();
    }

    public T peek() {
        return this.stack.peek();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void print() {
        this.stack.forEach(System.out::println);
    }
}
