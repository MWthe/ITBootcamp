package Nedelja5.Product;

import java.util.Scanner;

public class SinglePurchaseService extends Service {
    Scanner sc = new Scanner(System.in);
    public SinglePurchaseService(double price) {
        super(price);
    }

    public String getProduct() {
        System.out.print("Unesite platformu: ");
        var proizvod = sc.nextLine();
        return proizvod;
    }
    @Override
    public double getPrice() {
        System.out.print("Unesite cenu: ");
        price = sc.nextDouble();;
        return price;
    }
}
