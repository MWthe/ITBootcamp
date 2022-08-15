package Nedelja1;

import java.util.Scanner;

public class vezba2 {
    public static void main(String[] args) {

//        Корисник може унети n бројева са тастатуре, програм се зауставља када
//        користин напише команду “stop”:
//        Програм проверава сваки унос корисника (сваки број који корисник унесе);
//        Ако је број који је корисник унео дељив са 2, програм исписује “Broj je
//        deljiv sa 2”;
//        Ако број није дељив са 2, програм исписује “Broj nije deljiv sa 2”.

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Unesite bilo koji broj ili STOP da zaustavite program: ");
            String inputString = sc.next();

            if (inputString.toUpperCase().equals("STOP")) {
                System.out.println("Kraj programa");
                return;
            } else {
                int inputInt = Integer.parseInt(inputString);
                if (inputInt % 2 == 0) {
                    System.out.println("Broj je deljiv sa 2");
                } else {
                    System.out.println("Broj nije deljiv sa 2");
                }

            }
        }
    }
}