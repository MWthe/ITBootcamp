package Nedelja2;

import java.util.Scanner;

public class ZadatakRepeat {

    public static String repeat(String inputString, int a) {
        String str = "";
        for (int i = 0; i < a; i++) {
           str += inputString;
        }
        return str;
    }



    public static void printMultiple(String inputString2, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(inputString2);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi a: ");
        int a = sc.nextInt();
        System.out.println("Unesi b: ");
        int b = sc.nextInt();

        String row = repeat("#", a);
        //System.out.println(row);
           printMultiple(row, b);

    }

}


