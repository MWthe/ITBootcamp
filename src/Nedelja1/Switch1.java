package Nedelja1;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int a = 1;
//
//        switch (a){
//            case 1 : System.out.println("Odgovor je 1"); break;
//            case 2 : System.out.println("Odgovor je 2"); break;
//            case 3 : System.out.println("Odgovor je 3"); break;
//            default: System.out.println("Odgovor ne postoji");
//        }

//        char input = sc.next().charAt(0);
        int brojac1 = 0;

        while (true) {
            System.out.println("Unesi Y/N: ");
            char ulaz = sc.next().charAt(0);
            if (ulaz == 'Y') {
                brojac1 = brojac1 + 1;
            }
            if (ulaz == 'N') {
                break;
            }
        }
        System.out.println(brojac1);
    }
}