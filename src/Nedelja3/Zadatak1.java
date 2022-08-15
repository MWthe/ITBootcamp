package Nedelja3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {



    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            double suma = 0.0;
            double average = 0.0;
            double counter = 0.0;
            while (true) {
                System.out.println("Unesite brojeve ili 0 za kraj programa: ");
                int x = sc.nextInt();
                if (x == 0) {
                    break;
                } else {
                    list.add(x);
                counter += 1;
                suma += x;
            }
            }
                average = suma / counter;

        System.out.println(average);

    }
}



