package main.structure.linkedstack;

import main.pojo.Employee;

public class LinkedStackTest {
    public static void main(String[] args) {
        final LinkedStack<Employee> linkedStack = new LinkedStack<>();

        final Employee janeJones = new Employee("Jane", "Jones", 1);
        final Employee johnDoe = new Employee("Jonh", "Doe", 2);
        final Employee marrySmith = new Employee("Marry", "Smith", 3);
        final Employee mikeWilson = new Employee("Mike", "Wilson", 4);
        final Employee billEnd = new Employee("Bill", "End", 5);

        System.out.println(linkedStack.isEmpty());

        linkedStack.push(janeJones);
        linkedStack.push(johnDoe);
        linkedStack.push(marrySmith);
        linkedStack.push(mikeWilson);
        linkedStack.push(billEnd);

        linkedStack.print();
        System.out.println(linkedStack.isEmpty());

        linkedStack.pop();
        linkedStack.print();

        linkedStack.peek();
        linkedStack.print();
    }
}
