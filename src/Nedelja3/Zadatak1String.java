package Nedelja3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNumbers = new ArrayList<>();
        while (true){
            System.out.print("Unesi brojeve, ako zelis da prekines unesi stop: ");
            String unos = sc.nextLine();
            if (unos.equals("stop")) {
                break;
            }
            double x = Integer.parseInt(unos);
            listaNumbers.add((int) x);
            }

        double suma = 0;
        double average = 0;
        for (int i = 0; i < listaNumbers.size(); i++) {
            suma += listaNumbers.get(i);
            average = suma / listaNumbers.size();
        }
        System.out.println(average);
    }
}

