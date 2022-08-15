package Nedelja2;

import java.util.Scanner;

public class NiskeFunkcije {

    public static boolean contains2(String str, char c) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        } return false;
    }

    public static int indexOf2(String str, char c){
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(contains2(s, '%'));

    }
}
