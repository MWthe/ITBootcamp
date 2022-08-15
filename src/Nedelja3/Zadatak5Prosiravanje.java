package Nedelja3;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak5Prosiravanje {

//    Написати функцију која проширује String нулама до N карактера
//
//    ```java
//    padRight("dpj", 5); // Враћа "dpj00"
//    padRight("dpj", 2); // Враћа "dpj"
//    padRight("dpj", 3); // Враћа "dpj"
//    padRight("dpj11", 6); // Враћа "dpj110"
//
//    padLeft("dpj", 5); // Враћа "00dpj"
//    padLeft("dpj", 2); // Враћа "dpj"
//    padLeft("dpj", 3); // Враћа "dpj"
//    padLeft("dpj11", 6); // Враћа "0dpj11"
//    ```

    public static String padRight(String str, int n) {
        if (n < str.length()) {

        } else {
            return str + "0".repeat(n - str.length());
        }

        return str;
    }
    public static String padLeft(String str, int n) {
        if (n < str.length()) {

        } else {
           return "0".repeat(n - str.length()) + str;
        }

        return str;
    }
    //Написати програм који све елементе низа који имају мање од 4 карактера проширује нулама
    public static ArrayList<String> prosiruje4Levo (ArrayList<String> arrList) {
        ArrayList<String> levo = new ArrayList<>();
        for (int i = 0; i<arrList.size(); i++) {
            if (arrList.get(i).length() < 4) {
                levo.add("0".repeat(4 - arrList.get(i).length()) + arrList.get(i));
//                String paddedName = padLeft(arrList.get(i), 4);
//                levo.set(i, paddedName);
            } else {
                levo.add(arrList.get(i));
            }
        }

        return levo;
    }

    //Написати програм који све елементе низа који имају мање од 4 карактера проширује нулама
    public static ArrayList<String> prosiruje4Desno (ArrayList<String> arrList) {
        ArrayList<String> desno = new ArrayList<>();
        for (int i = 0; i<arrList.size(); i++) {
            if (arrList.get(i).length() < 4) {
                desno.add(arrList.get(i) + "0".repeat(4 - arrList.get(i).length()));
            } else {
                desno.add(arrList.get(i));
            }
        }

        return desno;
    }

    public static void main (String[]args){

            var arrList = new ArrayList<>(Arrays.asList("abc","abcde","abcce","ab","bce"));

            System.out.println(padRight("dpj", 10));
            System.out.println(padLeft("dpj", 5));

            System.out.println(arrList);
            System.out.println(prosiruje4Levo(arrList));
            System.out.println(prosiruje4Desno(arrList));



        }
    }
