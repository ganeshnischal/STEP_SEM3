package main.OOP.Class__Problems;

class Basic{
    String code;
    String title;
    Basic(String code, String title) {
        this.code = code;
        this.title = title;
    }
}
public class Course{
    public static void main(String[] args) {
        Basic c = new Basic("21CSC201J", "Data Structures");
        System.out.println(c.code + " - " + c.title);
    }
}