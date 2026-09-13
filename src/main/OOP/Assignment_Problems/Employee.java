package main.OOP.Assignment_Problems;

class Field{
    String empName;
    double salary;
    boolean permanent;
}
public class Employee {
    public static void main(String[] args) {
        Field employee = new Field();
        System.out.println("Name: " + employee.empName);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Permanent: " + employee.permanent);
    }
}