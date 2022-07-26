package main.structure.doublelinkedlist;

import main.pojo.Employee;

public class DoubleLinkedListTest {

    public static void main(String[] args) {
        final Employee janeJones = new Employee("Jane", "Jones", 1);
        final Employee johnDoe = new Employee("Jonh", "Doe", 2);
        final Employee marrySmith = new Employee("Marry", "Smith", 3);
        final Employee mikeWilson = new Employee("Mike", "Wilson", 4);
        final Employee billEnd = new Employee("Bill", "End", 5);

        final EmployeeDoubleLinkedList linkedList = new EmployeeDoubleLinkedList();

        System.out.println(linkedList.isEmpty());

        linkedList.add(janeJones);
        linkedList.add(johnDoe);
        linkedList.add(marrySmith);
        linkedList.add(mikeWilson);

        System.out.println(linkedList.size());
        linkedList.print();

        linkedList.addToEnd(billEnd);
        System.out.println(linkedList.size());
        linkedList.print();

        linkedList.removeFromFront();
        System.out.println(linkedList.size());
        linkedList.print();

        linkedList.removeFromEnd();
        System.out.println(linkedList.size());
        linkedList.print();

        final Employee andreyKoh = new Employee("Andrey", "Koh", 6);
        linkedList.addBefore(andreyKoh, marrySmith);

        System.out.println(linkedList.size());
        linkedList.print();
    }

}
