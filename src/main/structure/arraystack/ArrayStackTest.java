package main.structure.arraystack;

import main.pojo.Employee;

public class ArrayStackTest {

    public static void main(String[] args) {
        final ArrayStack arrayStack = new ArrayStack(5);

        final Employee janeJones = new Employee("Jane", "Jones", 1);
        final Employee johnDoe = new Employee("Jonh", "Doe", 2);
        final Employee marrySmith = new Employee("Marry", "Smith", 3);
        final Employee mikeWilson = new Employee("Mike", "Wilson", 4);
        final Employee billEnd = new Employee("Bill", "End", 5);

        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.size());

        arrayStack.push(janeJones);
        arrayStack.push(johnDoe);
        arrayStack.push(marrySmith);
        arrayStack.push(mikeWilson);
        arrayStack.push(billEnd);

        arrayStack.print();
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.size());

        arrayStack.pop();
        arrayStack.print();
        System.out.println(arrayStack.size());

        arrayStack.peek();
        arrayStack.print();
        System.out.println(arrayStack.size());
    }
}
