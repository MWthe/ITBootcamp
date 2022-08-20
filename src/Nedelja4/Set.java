package Nedelja4;

import java.util.Arrays;
import java.util.HashSet;

public class Set {

    public static int[] duplikati(int[] arr) {
        HashSet<Integer> bezduplikata = new HashSet<>();
        for (var el : arr) {
            bezduplikata.add(el);
        }
        int i = 0;
        int[] removedDuplicates = new int[bezduplikata.size()];
        for (var el : bezduplikata) {
            removedDuplicates[i] = el;
            i++;
        }


        return removedDuplicates;
    }


    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 5, 2, 8, 90, 8};
        System.out.println(Arrays.toString(duplikati(arr)));

//        Написати функцију која враћа прослеђен низ целих бројева, али без дупликата
//        Напомена: Редослед није важан
//        Помоћ: Функција која тражи да ли се неки елемент налази у низу

//        removeDuplicates(arr); // Враћа [1, 2, 3, 4, 5, 8, 90]

    }
}
