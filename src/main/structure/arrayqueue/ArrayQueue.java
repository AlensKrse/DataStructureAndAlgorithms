package main.structure.arrayqueue;

import main.pojo.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(final int capacity) {
        this.queue = new Employee[capacity];
    }

    public void add(final Employee employee) {
        if (this.back == this.queue.length) {
            final Employee[] newArray = new Employee[2 * this.queue.length];
            System.arraycopy(this.queue, 0, newArray, 0, this.queue.length);
            this.queue = newArray;
        }

        this.queue[this.back++] = employee;
    }

    public Employee remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        final Employee employee = this.queue[this.front];
        this.queue[this.front++] = null;

        if (isEmpty()) {
            resetParameters();
        }

        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return this.queue[this.front];
    }

    public void print() {
        for (int count = this.front; count < this.back; count++) {
            System.out.println(this.queue[count]);
        }
    }

    private void resetParameters() {
        this.front = 0;
        this.back = 0;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return Math.abs(this.front - this.back);
    }
}
