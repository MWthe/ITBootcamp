package Nedelja1;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        // Napisati program koji konvertuje C u F
        // i Obrnuto
        // Korisnik prvo unosi C ili F (sta on unosi)
        // Mi ispusujemo vrednost u drugom sistemu

        // F = (C * 9/5) + 32
        Scanner sc = new Scanner(System.in);
        System.out.print("Izaberite stepen iz koga pretvarate (C ili F): ");
        String tip = sc.nextLine();
        if (tip.equals("C")) {
            System.out.print("Unesite broj u stepenima C: ");
            double stepenC = sc.nextDouble();
            double stepenF = (stepenC * 9 / 5) + 32;
            System.out.println("Temperatura u Farenhajtu je: " + stepenF);
        } else if (tip.equals("F")) {
            System.out.print("Unesite broj u stepenima F: ");
            double stepenF = sc.nextDouble();
            double stepenC = (stepenF - 32) * 5 / 9;
            System.out.println("Temperatura u Celizijusima je: " + stepenC);
        } else {
            System.out.println("Nepravilan unos!");
        }

    }
}
