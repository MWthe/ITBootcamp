package Nedelja1;

import java.util.Scanner;

public class DodatniZadatak2 {
    public static void main(String[] args) {
//        Написати програм који исписује збир свих унетих бројева док се не унесе 0
//        Напомена: Није неопходан детаљан испис као испод, али је пожељан
//        Пример тока програма:
//        Унесите број: 5
//        Збир је: 5 , Унесите следећи број или 0 да изађете из програма: 3
//        Збир је: 8 , Унесите следећи број или 0 да изађете из програма: -7
//        Збир је: 1 , Унесите следећи број или 0 да изађете из програма: 0
//        Укупан збир је 1

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite brojeve koje zelite da saberete ili oduzmete ili 0 za prekid programa: ");
        int number;
        int sumaBrojeva = 0;
        boolean isTrue = true;

        while ((number = sc.nextInt()) != 0) {
            sumaBrojeva += number;
            System.out.println("Zbir je: " + sumaBrojeva);
        } System.out.println("Konacna suma je: " + sumaBrojeva);
    }
}
