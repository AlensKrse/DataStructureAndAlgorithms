package main.pojo;

import java.util.Objects;

public class StoredEmployee {

    private String key;
    private Employee employee;

    public StoredEmployee(final String key, final Employee employee) {
        this.key = key;
        this.employee = employee;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(final Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final StoredEmployee that = (StoredEmployee) o;
        return Objects.equals(key, that.key) && Objects.equals(employee, that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, employee);
    }

    @Override
    public String toString() {
        return "StoredEmployee{" +
                "key='" + key + '\'' +
                ", employee=" + employee +
                '}';
    }
}
