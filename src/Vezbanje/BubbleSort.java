package Vezbanje;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = {7, 12, 34, 1, 75, 23};
        System.out.println(Arrays.toString(bubbleSort(arr1)));
    }
}
