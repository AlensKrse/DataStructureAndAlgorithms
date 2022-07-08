package main.pojo;

import java.util.Objects;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(final Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(final Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(final EmployeeNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final EmployeeNode that = (EmployeeNode) o;
        return Objects.equals(employee, that.employee) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, next);
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
