package Nedelja2;

public class Funkcije {

    //    //  Написати функцију која враћа мањи од 2 броја (без Math.min)
//
//    public static int minimal(int x, int y) {
//        if (x < y) {
//            return x;
//        } else {
//            return y;
//        }

    // Написати функцију која враћа мањи од 3 броја

//        public static int minimal2(int a, int b, int c) {
//            if (a < b && a < c) {
//                return a;
//            } else if (b < a && b < c) {
//                return b;
//            } else {
//                return c;
//            }
//        }

    // Написати функцију која враћа збир бројева од N до M (N и M се прослеђују)

//    public static int zbirBrojeva(int n, int m) {
//        int sum = 0;
//        for (int i = n; i < m; i++) {
//            sum += i;
//        } return sum;
//    }

    // Написати функцију која враћа n-ти степен броја (прослеђују се број па степен)

    public static int nTiStepen(int x, int n) {
        int stepen = 1;
        for (int i = 0; i < n; i++) {
            stepen *= x;
        } return stepen;
    }

        public static void main (String[]args){

            //System.out.println(minimal(4, 5));
            //System.out.println(minimal2(3, 5, 6));
            //System.out.println(zbirBrojeva(5, 10));
            System.out.println(nTiStepen(2, 3));

        }
    }

