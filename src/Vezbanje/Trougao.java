package Vezbanje;

import java.util.Arrays;
import java.util.Scanner;

public class Trougao {

    public static void pyramid(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }


    }
        public static void main (String[]args){
//        Scanner sc = new Scanner(System.in);
//        int numb = sc.nextInt();
            pyramid(7);

        }
    }
