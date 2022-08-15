package Test1;

public class Zadatak3 {

    public static void structure(int h, int w) {
        System.out.println(" " + "#".repeat(w - 2));
        for (int i = 0; i < h - 2; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("#");
            }
            for (int k = 0; k < w - 2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print("#");
            }
            System.out.println();

        } System.out.println(" " + "#".repeat(w - 2));
    }
    public static void main(String[] args) {

        structure(8,5);

        // Malo je pešice ali nadam se da je ok :D

    }
}
