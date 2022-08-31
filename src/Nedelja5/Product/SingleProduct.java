package Nedelja5.Product;

import java.util.Scanner;

public class SingleProduct extends Product{
    Scanner sc = new Scanner(System.in);

    public SingleProduct(double price) {
        super(price);
    }

    public String getProduct() {
        System.out.print("Unesite proizvod: ");
        var proizvod = sc.next();
        return proizvod;
    }
    @Override
    public double getPrice() {
        System.out.print("Unesite cenu: ");
        price = sc.nextDouble();;
        return price;
    }
}
