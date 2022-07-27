package main.structure.arraystack;

import main.pojo.Employee;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(final int capacity) {
        this.stack = new Employee[capacity];
    }

    public void push(final Employee employee) {
        final int length = this.stack.length;
        if (this.top == length) {
            final Employee[] newArray = new Employee[length * 2];
            System.arraycopy(this.stack, 0, newArray, 0, length);
            this.stack = newArray;
        }

        this.stack[this.top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        final Employee employee = this.stack[--this.top];
        this.stack[top] = null;

        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return this.stack[top - 1];
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public int size() {
        return this.top;
    }

    public void print() {
        for (int count = this.top - 1; count >= 0; count--) {
            System.out.println(this.stack[count]);
        }
    }
}
