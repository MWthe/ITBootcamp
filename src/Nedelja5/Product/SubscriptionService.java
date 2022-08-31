package Nedelja5.Product;

import java.util.Scanner;

public class SubscriptionService extends Service {
    double forHowLong;
    Scanner sc = new Scanner(System.in);
    public SubscriptionService(double price, double forHowLong) {
        super(price);
        this.forHowLong = forHowLong;
    }
    public String getProduct() {
        System.out.print("Unesite platformu: ");
        var proizvod = sc.nextLine();
        return proizvod;
    }
    @Override
    public double getPrice() {
        System.out.print("Unesite cenu: ");
        price = sc.nextInt();
        System.out.print("Na koji period (meseci): ");
        forHowLong = sc.nextInt();
        return forHowLong * price;
    }
}
