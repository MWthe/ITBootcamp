package Nedelja1;

import java.util.Scanner;

public class PetljeZadatak3 {
    public static void main(String[] args) {
// Мост има носивост M, написати програм који учитава број аутомобила на мосту,
// а затим и масу сваког од њих.
// Затим исписати да ли мост може да издржи све аутомобиле или не

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite nosivost mosta: ");
        int nosivostMost = sc.nextInt();
        System.out.print("Unesite broj automobila na mostu: ");
        int brojAutomobila = sc.nextInt();
        int sumMasaAutomobila = 0;
        int masaAutomobila = 0;

        for (int n = 1; n <= brojAutomobila; n++) {
            System.out.print("Unesite masu automobila " + n + ": ");
            masaAutomobila = sc.nextInt();
            sumMasaAutomobila += masaAutomobila;
        }
        if (nosivostMost>sumMasaAutomobila){
            System.out.println("Nosivnost mosta je dovoljna");
        } else {
            System.out.println("Nosivost mosta nije dovoljna");
        }
    }
}
