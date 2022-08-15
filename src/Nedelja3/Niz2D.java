package Nedelja3;

import java.util.Scanner;

public class Niz2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int sum = 0;
        int sumgd = 0;
        int sumsd = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Unesite element [" + i + "]" + "[" + j + "]:");
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
                if (i == j) {
                    sumgd += matrix[i][j];
                }
                if (i + j == matrix.length - 1) {
                    sumsd += matrix[i][j];
                }
            }

        }
        System.out.println("Suma elemenata matrice je: " + sum);
        System.out.println("Suma glavne dijagonale je: " + sumgd);
        System.out.println("Suma sporedne dijagonale je: " + sumsd);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
