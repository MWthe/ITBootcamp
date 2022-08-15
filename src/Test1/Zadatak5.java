package Test1;

import java.util.Arrays;

public class Zadatak5 {

    public static int[] removeDuplicates(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr[i]) {
                    arr2[j] -= arr[i]; // ne znam kako da ga izbacim iz stringa...
                }
            }
            arr2[i] += arr[i];
        }
        return arr2;
    }
        public static void main (String[]args){
            int[] arr3 = {1, 1, 2, 3, 3, 4, 5, 2, 8, 90, 8};
            System.out.println(Arrays.toString(removeDuplicates(arr3)));
        }
    }
