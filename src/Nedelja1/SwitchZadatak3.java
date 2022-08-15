package Nedelja1;

import java.util.Scanner;

public class SwitchZadatak3 {
    public static void main(String[] args) {

        //Unos je broj sa tastature, i jedan random (0,100) broj (sakriven)
        //Izlaz programa:
        //skriveni broj = našem ulazu "broj je jednak" skriveni broj != "bro nije jednak"

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = (int) (Math.random()*100);

        if (x==y) {
            System.out.println("broj je jednak");
        } else {
            System.out.println("broj nije jednak");
        }
        System.out.println(y);
    }
}
