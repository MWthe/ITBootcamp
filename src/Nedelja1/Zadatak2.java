package Nedelja1;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Koliko imate godina?: ");
        int godine = sc.nextInt();

        if (godine >= 18){
            System.out.println("Za vas imamo odlicno psenicno pivo!");
        } else if (godine > 0){
            System.out.println("Za vas imamo veliki odlican sok!");
        } else {
            System.out.println("Molimo Vas unesite pravilan broj godina");
        }

    }
}

//1. Написати програм за пивницу, који од корисника тражи да унесе број година (цео број)
//        - Ако корисник има строго мање од 18 година, понудити му сок (println)
//        - Ако корисник има више од 18 година, понудити му пиво
//
//        ```
//        Напомена: Шта ако корисник унесе -5?
//
//        Пример програма:
//
//        Добродошли у пивницу ITBC, колико имате година?
//        19
//
//        За Вас имамо одлично пшенично пиво!
//        ```


