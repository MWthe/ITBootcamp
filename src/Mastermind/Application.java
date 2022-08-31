package Mastermind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        var igra = new Skocko(5, 4); // ...

        while(!igra.jeGotova()){
            igra.pokusaj();
        }


        // 98% zadatka je bio odradjen pre nego da sam uopste video tvoje resenje ali pomoglo je dosta da shvatim neke stvari.
        // i dalje nisam siguran da je porediKombinacije dobro ali sve sto sam pokusao je radilo

        // _____________________________________________________________

//        Scanner sc = new Scanner(System.in);
//        var kombinacija1 = new KombinacijaZnakova(4);
//        var randCombo = new KombinacijaZnakova(4);
//        var rand = randCombo.setRandom();
//        System.out.println(rand);
//        while (!kombinacija1.equals(randCombo)) {
//            kombinacija1.setKombinacija();
//            kombinacija1.porediKombinacije(randCombo);
//        }
    }
}

