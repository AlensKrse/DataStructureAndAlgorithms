package main.structure;

import main.pojo.Employee;
import main.pojo.EmployeeNode;

import java.util.Objects;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void add(final Employee employee) {
        final EmployeeNode node = new EmployeeNode(employee);
        node.setNext(this.head);
        this.head = node;
        this.size++;
    }

    public EmployeeNode remove() {
        if (isEmpty()) {
            return null;
        } else {
            final EmployeeNode removedNode = this.head;
            this.head = this.head.getNext();
            this.size--;
            removedNode.setNext(null);

            return removedNode;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return Objects.isNull(this.head);
    }

    public void print() {
        EmployeeNode current = this.head;
        System.out.print("HEAD -> ");
        while (Objects.nonNull(current)) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }
}
