package Mastermind;

import java.util.ArrayList;
import java.util.Scanner;

public class Skocko {
    private int maxBrPokusaja;
    private int brPokusaja;
    private KombinacijaZnakova trazenaKombinacija;
    private KombinacijaZnakova trenutnaKombinacija;

    // Конструктор


    public Skocko(int maxBrPokusaja, int velicina) {
        System.out.println("-----Dobrodosli u Skocka-------" + '\n');
        System.out.println("Imate " + maxBrPokusaja + " pokusaja da nadjete pravu kombinaciju.");
        System.out.println("Dozvoljeni znakovi su: " + Znakovi.dozvoljeniZnakovi + '\n');


        this.maxBrPokusaja = maxBrPokusaja;
        trazenaKombinacija = new KombinacijaZnakova(4);
        trenutnaKombinacija = new KombinacijaZnakova(4);
        trazenaKombinacija.setRandom();
        brPokusaja = 0;
    }

    public void pokusaj() {
        brPokusaja++;
        trenutnaKombinacija.setKombinacija();
        trenutnaKombinacija.porediKombinacije(trazenaKombinacija);
        }

        public boolean jeGotova () {
            if (brPokusaja > maxBrPokusaja) {
                System.out.println("Izgubili ste");
                return true;
            }
            if (trenutnaKombinacija.equals(trazenaKombinacija)) {
                return true;
            }
            return false;
        }
    }




//    Scanner sc = new Scanner(System.in);
//    var kombinacija1 = new KombinacijaZnakova(4);
//    var randCombo = new KombinacijaZnakova(4);
//    var rand = randCombo.setRandom();
//        System.out.println(rand);
//                while (!kombinacija1.equals(randCombo)) {
//                kombinacija1.setKombinacija();
//                kombinacija1.porediKombinacije(randCombo);