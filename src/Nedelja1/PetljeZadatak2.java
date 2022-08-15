package Nedelja1;

import java.util.Scanner;

public class PetljeZadatak2 {
    public static void main(String[] args) {
        //Unosi se broj n sa tastature
        //Program računa zbir svih parnih i svih neparnih brojeva od 0 do broja n, bez datog broja n

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj: ");
        int broj = sc.nextInt();
        int sumaParnih = 0;
        int sumaNeparnih = 0;

        for (int n = 0; n < broj; n++) {
            if (n % 2 == 0) {
                sumaParnih += n;
            } else {
                sumaNeparnih += n;
            }
        }
        System.out.println("Suma parnih: " + sumaParnih);
        System.out.println("Suma neparnih: " + sumaNeparnih);
    }
}
