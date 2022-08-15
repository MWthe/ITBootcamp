package Nedelja2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Корисник уноси цео број од 1 до 7 (6,7 - субота,недеља)
        // Исписујемо да ли је викенд или радни дан
        System.out.println("Unesite broj od 1 do 7:");
        int broj = sc.nextInt();

        if (broj >= 1 || broj <= 5) {
            System.out.println("Nije vikend");
        } else if (broj == 6 || broj == 7){
            System.out.println("Vikend");
        } else {
            System.out.println("Broj koji ste uneli nije validan");
        }
    }

}
