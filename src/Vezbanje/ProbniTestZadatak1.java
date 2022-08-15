package Vezbanje;

public class ProbniTestZadatak1 {

    public static int faktorijal(int num) {
        int rezultat = 1;
        for (int i = 1; i <= num; i++) {
          rezultat *= i;

        }
        return rezultat;
    }

    public static void main(String[] args) {

        System.out.println(faktorijal(10));

    }
}


