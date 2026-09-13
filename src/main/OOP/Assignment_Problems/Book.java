package main.OOP.Assignment_Problems;

class Record{
    String title;
    double price;
}
public class Book{
    public static void main(String[] args) {
        Record book = new Record();
        book.title = "Clean Code";
        book.price = 650.0;
        System.out.println("Title: " + book.title + " | Price: Rs " + book.price);
    }
}