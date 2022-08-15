package Nedelja1;

import java.util.Scanner;

public class DodatniZadatak1 {
    public static void main(String[] args) {

//        Написати збир целих бројева од N до M (Укључујући оба)
//        N и M се уносе са тастатуре
//        Напомена: N може бити и мање од M, видети Пример2
//        Пример1:
//        Корисник уноси: 5 11
//        Испис: 56 (5 + 6 + 7 + 8 + 9 + 10 + 11)
//        Пример2:
//        Корисник уноси: 11 8
//        Испис: 38 (8 + 9 + 10 + 11)

        Scanner sc = new Scanner(System.in);

        System.out.print("Molimo Vas unesite dva broja: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sumaBrojeva = 0;
        int n;

        if (a < b) {
            for (n = a; n <= b; n++) {
                sumaBrojeva += n;
            }
            System.out.println(sumaBrojeva);
        } else {
            for (n = b; n <= a; n++) {
                sumaBrojeva += n;
            }
            System.out.println(sumaBrojeva);
        }
    }
}