package main.OOP.Assignment_Problems;

class product {
    String productId;
    String productName;
    product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}
public class Product {
    public static void main(String[] args) {
        product product = new product("P-1042", "Wireless Mouse");
        System.out.println(product.productId + " - " + product.productName);
    }
}