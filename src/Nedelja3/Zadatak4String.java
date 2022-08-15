package Nedelja3;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak4String {
    //Написати програм који избацује све елементе листе који имају мање од 4 карактера
    //- String

    public static ArrayList<String> moreThanFour(ArrayList<String> arrList) {

        arrList.removeIf(el -> el.length() <= 4);

        return arrList;
    }

    public static void main(String[] args) {

        var arrList = new ArrayList<>(Arrays.asList("abc","abcde","abcce","ab","bce"));
        System.out.println(arrList);
        System.out.println(moreThanFour(arrList));
    }
}
