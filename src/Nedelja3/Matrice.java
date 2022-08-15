package Nedelja3;

import java.util.Scanner;

public class Matrice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("unesi broj redova i kolona");

        int r = input.nextInt();
        int k = input.nextInt();
        int niz[][] = new int[r][k];

        System.out.print("unesi clanove ");
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz[i].length; j++) {
                System.out.print("X[" +i+ "," +j +"]"+ "-->");
                niz[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < niz.length; i++) {
            System.out.println();
            for (int j = 0; j < niz[i].length; j++) {
                System.out.print(niz[i][j] + " ");
            }
        }
        System.out.println();
        System.out.print("clanovi sa indeksom kolone koji nije djeljiv sa 3 su: ");
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz[i].length; j++) {
                if ((j + 1) % 3 != 0)
                    System.out.print(niz[i][j] + " ");
            }
        }
        input.close();
    }
}
