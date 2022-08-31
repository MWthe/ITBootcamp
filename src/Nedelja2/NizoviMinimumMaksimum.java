package Nedelja2;

public class NizoviMinimumMaksimum {

    static int[] niz1 = {-3234, 12, 124, 6, 126, 2, 22, 661};

    public static int Max(int[] arr) {
        int max = arr[0];
        for (int el = 0; el < arr.length; el++) {
            if (arr[el] > max) {
                max = arr[el];
            }
        }
        return max;
    }

    public static int Min(int[] arr) {
        int min = arr[0];
        for (int el = 0; el < arr.length; el++) {
            if (arr[el] < min) {
                min = arr[el];
            }
        }
        return min;
    }


    public static void main(String[] args) {

        System.out.println(Max(niz1));
        System.out.println(Min(niz1));
    }
}
