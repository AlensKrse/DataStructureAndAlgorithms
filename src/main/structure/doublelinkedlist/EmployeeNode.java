package main.structure.doublelinkedlist;

import main.pojo.Employee;

import java.util.Objects;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

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

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(final EmployeeNode previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final EmployeeNode that = (EmployeeNode) o;
        return Objects.equals(employee, that.employee) && Objects.equals(next, that.next) && Objects.equals(previous, that.previous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, next, previous);
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
