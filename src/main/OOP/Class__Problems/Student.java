package main.OOP.Class__Problems;

class StudentData {
    String name;
    int marks;
}
public class Student{
    public static void main(String[] args) {
        StudentData s = new StudentData();
        s.name = "Divya";
        s.marks = 88;
        System.out.println("Name: " + s.name + " | Marks: " + s.marks);
    }
}