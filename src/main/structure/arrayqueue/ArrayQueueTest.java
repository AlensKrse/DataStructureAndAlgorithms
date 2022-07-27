package main.structure.arrayqueue;

import main.pojo.Employee;

public class ArrayQueueTest {

    public static void main(String[] args) {
        final Employee janeJones = new Employee("Jane", "Jones", 1);
        final Employee johnDoe = new Employee("Jonh", "Doe", 2);
        final Employee marrySmith = new Employee("Marry", "Smith", 3);
        final Employee mikeWilson = new Employee("Mike", "Wilson", 4);
        final Employee billEnd = new Employee("Bill", "End", 5);

        final ArrayQueue arrayQueue = new ArrayQueue(5);

        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.isEmpty());

        arrayQueue.add(janeJones);
        arrayQueue.add(johnDoe);
        arrayQueue.add(marrySmith);
        arrayQueue.add(mikeWilson);
        arrayQueue.add(billEnd);

        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.isEmpty());
        arrayQueue.print();

        arrayQueue.peek();

        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.isEmpty());
        arrayQueue.print();

        arrayQueue.remove();

        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.isEmpty());
        arrayQueue.print();
    }
}
