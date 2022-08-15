package Nedelja1;

import java.util.Scanner;

public class PetljeZadatak1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();
        int suma = 0;

        for (int a = 0; a <= broj; a++) {
            suma = suma + a;
        }

        System.out.println("Zbir je: " + suma);
    }
}
