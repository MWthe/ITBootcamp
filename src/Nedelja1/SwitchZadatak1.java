package Nedelja1;

import java.util.Locale;
import java.util.Scanner;

public class SwitchZadatak1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite : ");
        String a = sc.nextLine().toLowerCase(Locale.ROOT);

        switch (a) {
            case "odgovor 1":
                System.out.println("Odgovor je 1"); break;
            case "odgovor 2":
                System.out.println("Odgovor je 2"); break;
            case "odgovor 3":
                System.out.println("Odgovor je 3"); break;
            case "odgovor 4":
                System.out.println("Odgovor je 4"); break;
            default:
                System.out.println("Odgovor ne postoji");
        }

    }
}
