package main.structure.linearprobinghashtable;

import main.pojo.Employee;
import main.pojo.StoredEmployee;

import java.util.Arrays;
import java.util.Objects;

public class LinearProbingHashTable {

    private StoredEmployee[] hashTable;

    public LinearProbingHashTable() {
        this.hashTable = new StoredEmployee[10];
    }

    public void put(final String key, final Employee employee) {
        int hash = hashKey(key);

        if (occupied(hash)) {
            int stopIndex = hash;
            if (hash == this.hashTable.length - 1) {
                hash = 0;
            } else {
                hash++;
            }

            while (occupied(hash) && hash != stopIndex) {
                hash = (hash + 1) % this.hashTable.length;
            }
        }

        if (occupied(hash)) {
            throw new ArrayStoreException();
        } else {
            this.hashTable[hash] = new StoredEmployee(key, employee);
        }
    }

    public Employee remove(final String key) {
        final int hash = findKey(key);
        if (hash == -1) {
            return null;
        }

        final Employee employee = this.hashTable[hash].getEmployee();
        this.hashTable[hash] = null;
        final StoredEmployee[] oldHashTable = this.hashTable;
        this.hashTable = new StoredEmployee[oldHashTable.length];

        for (final StoredEmployee storedEmployee : oldHashTable) {
            if (Objects.nonNull(storedEmployee)) {
                put(storedEmployee.getKey(), storedEmployee.getEmployee());
            }
        }

        return employee;
    }

    public Employee get(final String key) {
        final int hash = findKey(key);
        if (hash == -1) {
            return null;
        }
        return this.hashTable[hash].getEmployee();
    }

    private int findKey(final String key) {
        int hash = hashKey(key);
        final StoredEmployee storedEmployee = this.hashTable[hash];
        if (Objects.nonNull(storedEmployee) && storedEmployee.getKey().equals(key)) {
            return hash;
        }

        int stopIndex = hash;
        if (hash == this.hashTable.length - 1) {
            hash = 0;
        } else {
            hash++;
        }

        while (hash != stopIndex && Objects.nonNull(this.hashTable[hash]) && !this.hashTable[hash].getKey().equals(key)) {
            hash = (hash + 1) % this.hashTable.length;
        }

        if (Objects.nonNull(this.hashTable[hash]) && this.hashTable[hash].getKey().equals(key)) {
            return hash;
        } else {
            return -1;
        }
    }


    private int hashKey(final String key) {
        return key.length() % this.hashTable.length;
    }

    private boolean occupied(final int index) {
        return Objects.nonNull(this.hashTable[index]);
    }

    public void print() {
        Arrays.stream(this.hashTable).forEach(System.out::println);
    }
}
