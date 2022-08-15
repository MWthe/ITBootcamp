package Nedelja1;

import java.util.Scanner;

public class PetljeZadatak4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int broj;

        do {
            System.out.println("Unesite broj: ");
            broj = sc.nextInt();
            System.out.println(broj);
        } while (broj != 0);
    }
}
