package Nedelja2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Niske {
    // duzina String-a
    // da li niska sadrzi neki karakter (ili drugi nisku)
    // pozicija nekog karaktera
    // Izvucemo karakter sa odredjene pozicije

    public static void main(String[] args) {

        String s1 = "lskjdfkladj";
        String s2 = "";

        System.out.println(s1.length());
        System.out.println(s2.length());

        Scanner sc = new Scanner(System.in);
        String email = sc.next();

//        System.out.println(email.contains("@"));
//        System.out.println(email.indexOf("@"));
//
//        System.out.println(email.charAt(0));

//        if (!email.isEmpty()) {
//            System.out.println(email.charAt(5));
//        } else {
//            System.out.println("Ne moze");
//        }

        boolean contains = false; // Jos uvek ne znamo da li sadrzi

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                contains = true;
                break;
            }
        }
        System.out.println(contains);


        //////////////////////////
        int index = -1; // jer ne oznacava ni jedan od karaktera // index je pozicija elementa (ako ga pronadje)

        String allIndexes = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                //index = i;
                allIndexes += i + " ";
            }
        }
        System.out.println(allIndexes);
    }

    public static boolean contains2(String str, char c) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        } return false;
    }
}