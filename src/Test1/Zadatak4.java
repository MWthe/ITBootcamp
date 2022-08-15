package Test1;

public class Zadatak4 {

    public static int anyDivisibleBy(int[] arr, int n){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % n == 0) {
                counter += 1;
            }
        } return counter;
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 13, 14, 16, 25, 30, 32 };
        System.out.println(anyDivisibleBy(arr1,17));
    }
}
