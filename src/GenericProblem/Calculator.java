package GenericProblem;

import java.util.*;

class Product {
    double price;

    public double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    Mobile(double price) { this.price = price; }
}

class Laptop extends Product {
    Laptop(double price) { this.price = price; }
}

class PriceUtil {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}