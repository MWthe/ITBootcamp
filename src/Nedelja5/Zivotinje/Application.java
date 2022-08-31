package Nedelja5.Zivotinje;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();

        Animals[] zivotinje = new Animals[6];

        zivotinje [0] = new Dog ("Morti", "Labrador");
        zivotinje [1] = new Cat ("Dio", "Persijska");
        zivotinje [2] = new Chicken("Gorstak");
        zivotinje [3] = new Dolphin("Kazuma");
        zivotinje [4] = new Fish ("Herakles");
        zivotinje [5] = new Frog ("One");
    }
}
