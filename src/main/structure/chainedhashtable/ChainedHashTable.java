package main.structure.chainedhashtable;

import main.pojo.Employee;
import main.pojo.StoredEmployee;

import java.util.Arrays;
import java.util.LinkedList;

public class ChainedHashTable {

    private final LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];
        for (int index = 0; index < hashTable.length; index++) {
            hashTable[index] = new LinkedList<>();
        }
    }

    public void put(final String key, final Employee employee) {
        final int hashKey = hashKey(key);
        hashTable[hashKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(final String key) {
        final int hashKey = hashKey(key);
        final LinkedList<StoredEmployee> storedEmployees = hashTable[hashKey];
        for (final StoredEmployee storedEmployee : storedEmployees) {
            if (storedEmployee.getKey().equals(key)) {
                return storedEmployee.getEmployee();
            }
        }

        return null;
    }

    public Employee remove(final String key) {
        final int hashKey = hashKey(key);
        final LinkedList<StoredEmployee> storedEmployees = hashTable[hashKey];
        for (final StoredEmployee storedEmployee : storedEmployees) {
            if (storedEmployee.getKey().equals(key)) {
                hashTable[hashKey].remove(storedEmployee);
                return storedEmployee.getEmployee();
            }
        }

        return null;
    }

    private int hashKey(final String key) {
        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void print() {
        Arrays.stream(this.hashTable).forEach(System.out::println);
    }
}
