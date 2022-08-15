package Nedelja1;

import java.util.Scanner;

public class Petlje1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();

        for (int a = 0; a < broj; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}