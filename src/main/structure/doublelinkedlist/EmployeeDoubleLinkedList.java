package main.structure.doublelinkedlist;

import main.pojo.Employee;

import javax.xml.validation.Validator;
import java.util.Objects;

public class EmployeeDoubleLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void add(final Employee employee) {
        final EmployeeNode node = new EmployeeNode(employee);

        if (isEmpty()) {
            this.tail = node;
        } else {
            this.head.setPrevious(node);
            node.setNext(this.head);
        }

        this.head = node;
        this.size++;
    }

    public void addToEnd(final Employee employee) {
        final EmployeeNode node = new EmployeeNode(employee);
        if (isEmpty()) {
            this.head = node;
        } else {
            this.tail.setNext(node);
            node.setPrevious(this.tail);
        }

        this.tail = node;
        this.size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        } else {
            if (Objects.isNull(this.head.getNext())) {
                this.tail = null;
            } else {
                final EmployeeNode nextNode = head.getNext();
                nextNode.setPrevious(null);
            }

            final EmployeeNode removedNode = this.head;
            this.head = this.head.getNext();
            this.size--;
            removedNode.setNext(null);

            return removedNode;
        }
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        } else {
            if (Objects.isNull(this.tail.getPrevious())) {
                this.head = null;
            } else {
                final EmployeeNode previous = this.tail.getPrevious();
                previous.setNext(null);
            }

            final EmployeeNode removedNode = this.tail;
            this.tail = this.tail.getPrevious();
            this.size--;
            removedNode.setPrevious(null);

            return removedNode;
        }
    }

    public boolean addBefore(final Employee employeeToAdd, final Employee existingEmployee) {
        EmployeeNode current = this.head;
        while (Objects.nonNull(current)) {
            if (current.getEmployee().equals(existingEmployee)) {
                final EmployeeNode newNode = new EmployeeNode(employeeToAdd);
                final EmployeeNode previous = current.getPrevious();

                if (Objects.isNull(previous)) {
                    this.head = newNode;
                } else {
                    previous.setNext(newNode);
                    newNode.setPrevious(previous);
                    current.setPrevious(newNode);
                }

                newNode.setNext(current);
                this.size++;

                return true;
            }
            current = current.getNext();
        }

        return false;
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
            System.out.print(current + " <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
