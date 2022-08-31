package Nedelja5.Product;

public abstract class Service implements Pricable {

    double price;

    public Service(double price) {
        this.price = price;
    }
}
