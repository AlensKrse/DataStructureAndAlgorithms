package main.structure;

import main.pojo.Employee;

public class LinkedListTest {

    public static void main(String[] args) {
        final Employee janeJones = new Employee("Jane", "Jones", 123);
        final Employee johnDoe = new Employee("Jonh", "Doe", 4567);
        final Employee marrySmith = new Employee("Marry", "Smith", 22);
        final Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        final EmployeeLinkedList linkedList = new EmployeeLinkedList();

        System.out.println(linkedList.isEmpty());

        linkedList.add(janeJones);
        linkedList.add(johnDoe);
        linkedList.add(marrySmith);
        linkedList.add(mikeWilson);

        System.out.println(linkedList.size());
        linkedList.print();
        System.out.println();
        System.out.println(linkedList.isEmpty());

        linkedList.remove();
        System.out.println(linkedList.size());
        linkedList.print();

    }

}
