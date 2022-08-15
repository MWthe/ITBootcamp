package Nedelja3;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak3posNeg {

    //Написати програм који филтрира листу тако да добијемо:
    //       - Листу свих позитивних бројева
    //       - Листу свих негативних бројева


    public static ArrayList<Integer> positiveNumbers (ArrayList<Integer> arrList) {
        ArrayList <Integer> posNumb = new ArrayList<>();
        for (int el : arrList) {
            if (el > 0) {
                posNumb.add(el);
            }
        }
        return posNumb;
    }

    public static ArrayList<Integer> negativeNumbers (ArrayList<Integer> arrList) {
        ArrayList <Integer> negNumb = new ArrayList<>();
        for (int el : arrList) {
            if (el < 0) {
                negNumb.add(el);
            }
        }
        return negNumb;
    }


    public static void main(String[] args) {
        var arrList = new ArrayList<>(Arrays.asList(1,2,-3,4,5,-6,7));
        System.out.println(positiveNumbers(arrList));
        System.out.println(negativeNumbers(arrList));
    }
}
