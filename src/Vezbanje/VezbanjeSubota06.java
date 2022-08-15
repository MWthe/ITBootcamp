package Vezbanje;

import java.util.Scanner;

public class VezbanjeSubota06 {

    public static String sumaAutomobila() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite nosivost mosta: ");
        int bridgeCarry = sc.nextInt();
        System.out.println("Unesite broj automobila: ");
        int brojAutomobila = sc.nextInt();
        int sumaAutomobila = 0;
        for (int i = 1; i<=brojAutomobila; i++){
            System.out.println("Unesite nosivost automobila " + i + " : ");
            int carMass = sc.nextInt();
            sumaAutomobila += carMass;
        }  if (sumaAutomobila > bridgeCarry) {
            return "Nosivost mosta nije dovoljna";
        } else {
            return "Nosivost mosta je dovoljna";
        }
    }
    public static void main(String[] args) {

        System.out.println(sumaAutomobila());

        }

    }
