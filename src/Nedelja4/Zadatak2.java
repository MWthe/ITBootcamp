package Nedelja4;

import java.util.HashSet;
import java.util.Set;

public class Zadatak2 {

//    Колико у низу има дупликата:
//        1. Како год урадите океј је
//        2. Урадите помоћу Set-a
//        3. Урадите помоћу Set-a али без set.size и array.length

    public static int numberOfDuplicates(int[] arr) {
        Set <Integer> noDuplicates = new HashSet<>();
        int count = 0;
        for (var el : arr) {
            if (!noDuplicates.add(el)) {
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 5, 2, 8, 90, 8};
        System.out.println(numberOfDuplicates(arr));
    }
}
