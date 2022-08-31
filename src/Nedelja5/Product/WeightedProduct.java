package Nedelja5.Product;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WeightedProduct extends Product {

    double tezina;
    Scanner sc = new Scanner(System.in);

    public WeightedProduct(double price, double tezina) {
        super(price);
        this.tezina = tezina;
    }

    public String getProduct() {
        System.out.print("Unesite proizvod: ");
        var proizvod = sc.next();
        return proizvod;
    }
    @Override
    public double getPrice() {
        System.out.print("Unesite cenu: ");
        price = sc.nextDouble();
        System.out.print("Unesite tezinu (u KG): ");
        tezina = sc.nextDouble();
        return price * tezina;
    }

}
