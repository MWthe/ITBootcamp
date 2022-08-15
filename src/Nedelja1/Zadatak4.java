package Nedelja1;

import java.util.Scanner;

public class Zadatak4 {
    // Koliko kovanica najmanje moramo da vratimo za kusur
    // 20 10 5 2 1
    // korisnik unosi vrednost

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();

        int count20 = total / 20;

        // total - (count20 * 20)
        // total % 20

        // total = total % 20; // total %= 20;
        // total = total - (count20*20); // total -= count 20*20

        total = total % 20;

        int count10 = total / 10;
        total = total % 10;

        int count5 = total / 5;
        total = total % 5;

        int count2 = total / 2;
        total = total % 2;

        int count1 = total;

        int totalCoins = count20 + count10 + count5 + count1;
        System.out.println(totalCoins);
    }

}
