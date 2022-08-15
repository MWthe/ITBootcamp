package Nedelja1;

import java.util.Locale;
import java.util.Scanner;

public class SwitchZadatak4 {
    public static void main(String[] args) {
// Unosi brojeve (0 - 9) sa tastature, n puta, dok ne unese "stop"
// Broji koliko je puta korisnik uneo odredjene brojeve
// Ispisuje broj unetih brojeva
// 1 : 5
// 2 : 54
// ...
// 0 : 12

        Scanner sc = new Scanner(System.in);
        int brojac1 = 0;
        int brojac2 = 0;
        int brojac3 = 0;
        int brojac4 = 0;
        int brojac5 = 0;
        int brojac6 = 0;
        int brojac7 = 0;
        int brojac8 = 0;
        int brojac9 = 0;

        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Unesite broj od 0-9 ili stop da prekinte program: ");
            String stop = sc.nextLine().toLowerCase(Locale.ROOT);
            switch (stop) {
                case "1":
                    brojac1 += 1;
                    break;
                case "2":
                    brojac2 += 1;
                    break;
                case "3":
                    brojac3 += 1;
                    break;
                case "4":
                    brojac4 += 1;
                    break;
                case "5":
                    brojac5 += 1;
                    break;
                case "6":
                    brojac6 += 1;
                    break;
                case "7":
                    brojac7 += 1;
                    break;
                case "8":
                    brojac8 += 1;
                    break;
                case "9":
                    brojac9 += 1;
                    break;
                case "stop":
                    isTrue = false;

            }
        }
        System.out.println("1: " + brojac1);
        System.out.println("2: " + brojac2);
        System.out.println("3: " + brojac3);
        System.out.println("4: " + brojac4);
        System.out.println("5: " + brojac5);
        System.out.println("6: " + brojac6);
        System.out.println("7: " + brojac7);
        System.out.println("8: " + brojac8);
        System.out.println("9: " + brojac9);




    }
}