package Vezbanje;

import java.util.Arrays;

public class ProbniTestZadatak3 {

    //ovaj zadatak nisam ceo uradio na testu, dopisao sam posle samo novi niz jer sam se oko toga bio bunio
    public static int[] incrementedElements(int[] niz, int num) {
        int[] x = new int[niz.length];
        for (int i = 0; i < niz.length; i++) {
            niz[i] += num;
            x[i] = niz[i];
        }
        return x;
    }



    public static void main(String[] args) {

        int[] x = new int[] {1,2,3,4,5,6};
        int[] y = incrementedElements(x, 5);
        System.out.println(Arrays.toString(y));

    }
}
