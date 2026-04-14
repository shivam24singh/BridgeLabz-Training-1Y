package GenericProblem;

class ProductCategory {}

class Product<T extends ProductCategory> {
    double price;

    Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        double newPrice = product.getPrice() * (1 - percent / 100);
        System.out.println("Discounted Price: " + newPrice);
    }
}