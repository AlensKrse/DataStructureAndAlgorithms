package main.structure.chainedhashtable;

import main.pojo.Employee;
import main.structure.linearprobinghashtable.LinearProbingHashTable;

public class ChainedHashTableTest {

    public static void main(String[] args) {
        final Employee janeJones = new Employee("Jane", "Jones", 1);
        final Employee johnDoe = new Employee("Jonh", "Doe", 2);
        final Employee marrySmith = new Employee("Marry", "Smith", 3);
        final Employee mikeWilson = new Employee("Mike", "Wilson", 4);
        final Employee billEnd = new Employee("Bill", "End", 5);

        final ChainedHashTable table = new ChainedHashTable();
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
