package by.epam;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого
 * можно сформировать покупку из нескольких товаров
 */

public class Main {
    public static void main(String[] args) {

        Payment myProducts = new Payment("My Products");
        myProducts.addProduct(25.50, "Apple");
        myProducts.addProduct(25.50, "Apple");
        myProducts.addProduct(28.60, "Orange");
        myProducts.addProduct(50.63, "Fish");
        myProducts.addProduct(10.15, "bubblegum");
        myProducts.printPaymentInfo();
        myProducts.removeProduct("apple");
        myProducts.printPaymentInfo();
    }
}
