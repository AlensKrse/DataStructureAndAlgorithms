package main.structure.linearprobinghashtable;

import main.pojo.Employee;

public class LinearProbingHashTableTest {

    public static void main(String[] args) {
        final Employee janeJones = new Employee("Jane", "Jones", 1);
        final Employee johnDoe = new Employee("Jonh", "Doe", 2);
        final Employee marrySmith = new Employee("Marry", "Smith", 3);
        final Employee mikeWilson = new Employee("Mike", "Wilson", 4);
        final Employee billEnd = new Employee("Bill", "End", 5);

        final LinearProbingHashTable table = new LinearProbingHashTable();
        table.put("Jane", janeJones);
        table.put("Jonh", johnDoe);
        table.put("Marry", marrySmith);
        table.put("Mike", mikeWilson);
        table.put("Bill", billEnd);

        table.print();
        System.out.println("//////////////////");

        final Employee employee = table.get("Jane");
        System.out.println(employee);

        System.out.println("//////////////////");
        table.remove("Mike");
        table.print();
    }
}
