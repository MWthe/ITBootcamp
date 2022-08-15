package Nedelja3;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak2EvenNumbers {
    // Написати програм који избацује парне елементе из ArrayList-е

    public static ArrayList<Integer> oddNumbers (ArrayList<Integer> arrList) {
        ArrayList <Integer> oddNum = new ArrayList<>();
        for (int el : arrList) {
            if (el % 2 != 0) {
                oddNum.add(el);
            }
        }
        return oddNum;
    }

    public static void main(String[] args) {
        var arrList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(oddNumbers(arrList));

    }
}
