package Nedelja2;

public class NizoviMinMax {
    static int[] niz1 = {3234, 12, 124, 6, 126, 2, 22, 661};
    public static int MinMax(int[] Array) {
        int max = 0;
        for (int el : Array) {
           if (Array[el] > max) {
                max = Array[el];
               return max;
            }
        }

        return max;
    }
            public static void main (String[]args){
                System.out.println(MinMax(niz1));
    }
}


