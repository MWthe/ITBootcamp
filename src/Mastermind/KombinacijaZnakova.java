package Mastermind;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class KombinacijaZnakova {
    private int velicina;
    private ArrayList<String> kombinacija;

    // Конструктор који прима величину
    public KombinacijaZnakova(int velicina) {
        this.velicina = velicina;
        kombinacija = new ArrayList<>();
    }

    // void setter за комбинацију
    public ArrayList<String> setKombinacija() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite kombinaciju u formatu: " + "X ".repeat(velicina));
        kombinacija.clear();

        for (int i = 0; i < velicina; i++) {
            var znak = sc.next();
            kombinacija.add(znak);
        }
        if (!Znakovi.dozvoljeniZnakovi.containsAll(kombinacija)) {
            System.out.println("Dozvoljena znakovi su: " + Znakovi.dozvoljeniZnakovi);
            setKombinacija();
        }
        return kombinacija;
    }

    // void setRandom за комбинацију
    public ArrayList<String> setRandom() {
        kombinacija.clear();
        for (int i = 0; i < velicina; i++) {
            int index = (int) (Math.random() * Znakovi.dozvoljeniZnakovi.size());
            kombinacija.add(Znakovi.dozvoljeniZnakovi.get(index));
        }

        return kombinacija;
    }

    // boolean equals - Override


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KombinacijaZnakova that = (KombinacijaZnakova) o;
        return Objects.equals(kombinacija, that.kombinacija);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kombinacija);
    }

    // void porediKombinacije(KombinacijaZnakova kz)
    public void porediKombinacije(KombinacijaZnakova random) {
        int counterNotInPlace = 0;
        int counterInPlace = 0;
        ArrayList <Integer> index = new ArrayList();
        boolean isTrue = false;
        ArrayList<String> tmp = new ArrayList<>(random.kombinacija);

        for (int i = 0; i < this.kombinacija.size(); i++) {
            if (this.kombinacija.get(i).equals(random.kombinacija.get(i))) {
                counterInPlace++;
                index.add(i);
                random.kombinacija.set(i, "0");
            }
        }
        for (int j = 0; j < this.kombinacija.size(); j++) {
            if (random.kombinacija.contains(this.kombinacija.get(j)) && !index.contains(j)) { //random - this
                isTrue = true;
                    if (isTrue) {
                    counterNotInPlace++;
                }

            }

        }
        random.kombinacija = tmp;
        System.out.println("☻ ".repeat(counterInPlace) + "☺ ".repeat(counterNotInPlace));
    }
}


// broj pogodjenih ali na pogresnom mestu
// ☻ ☺