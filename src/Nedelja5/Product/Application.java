package Nedelja5.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        // Imam osecaj da mi je kod predugacak, radi sve ali opet mislim da moze mnogo krace da se napise.
        // Ako mozes molim te mi ostavi komentar ili kod kako mogu i sta mogu da skratim da bi znao za u buduce.
        // Ili ako nesto nisam uradio kako treba (trebao sam u klasi da unesem umesto ovde ili slicno).
        // Hvala puno.

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();
        ArrayList<String> proizvod = new ArrayList<>();
        double sum = 0;
        int counter = 0;
        System.out.println("Izbor: " + " \n0 - Излаз" +
                "\n1 - WeightedProduct" + "\n2 - SingleProduct" + "\n3 - SubscriptionService" + "\n4 - SinglePurchaseService");
        System.out.print("Unesite zeljenu kategoriju proizvoda: ");
        int izbor = sc.nextInt();
        while (izbor != 0) {
            if (izbor == 1) {
                var wp = new WeightedProduct(0, 0);
                proizvod.add(wp.getProduct());
                lista.add(wp.getPrice());
            }
            if (izbor == 2) {
                var sp = new SingleProduct(0);
                proizvod.add(sp.getProduct());
                lista.add(sp.getPrice());
            }
            if (izbor == 3) {
                var ss = new SubscriptionService(0, 0);
                proizvod.add(ss.getProduct());
                lista.add(ss.getPrice());
            }
            if (izbor == 4) {
                var sps = new SinglePurchaseService(0);
                proizvod.add(sps.getProduct());
                lista.add(sps.getPrice());
            }
            counter++;
            for (var el : lista) {
                sum += el;
            }
            System.out.print("\nUnesite ponovo izbor: ");
            izbor = sc.nextInt();
        }
        System.out.println("\nVas racun: ");
        for (int i = 0; i < counter; i++) {
            System.out.println("Proizvod: " + proizvod.get(i) + " - " + "Cena: " + lista.get(i));
        }
        System.out.println("Vas ukupan racun: " + sum);
    }
}



