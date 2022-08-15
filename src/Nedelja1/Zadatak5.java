package Nedelja1;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        // Pretvoriti broj dana u br. godina, nedelja i dana
        // Godina uvek ima 365 dana
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj dana: ");

        int number = sc.nextInt();

        int years = number / 365;
        number = number % 365;

        int weeks = number / 7;
        number = number % 7;

        int days = number;

        System.out.println("Ima " + years + " godina, " + weeks + " nedelja i " + days + " dana ");
    }
}
