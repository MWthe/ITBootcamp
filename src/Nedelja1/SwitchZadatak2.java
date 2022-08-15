package Nedelja1;

import java.util.Scanner;

public class SwitchZadatak2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite slovo: ");
        boolean isTrue = true;

        while (isTrue) {
            char input = sc.next().charAt(0);
            switch (input) {
                case 'A':
                    System.out.println("Adenin"); break;
                case 'C':
                    System.out.println("Citozin"); break;
                case 'G':
                    System.out.println("Guanin"); break;
                case 'T':
                    System.out.println("Timin"); break;
                default:
                    System.out.println("Uneli ste pogresno slovo");
                    isTrue = false;
            }

        }
    }
}