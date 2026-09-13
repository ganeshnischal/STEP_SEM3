package main.OOP.Assignment_Problems;

class OrderData {
    static int totalOrders = 0;
    OrderData() {
        totalOrders++;
    }
}
public class Order {
    public static void main(String[] args) {
        OrderData order1 = new OrderData();
        OrderData order2 = new OrderData();
        OrderData order3 = new OrderData();
        OrderData order4 = new OrderData();
        System.out.println("Total orders: " + OrderData.totalOrders);
    }
}