package Nedelja3;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <String> kola = new ArrayList<>();
        kola.add("BMW");
        kola.add("Volvo");
        kola.add("Audi");
        kola.add("Volkswagen");
        System.out.println(kola);
        System.out.println(kola.get(0));
        System.out.println(kola.get(1));
        System.out.println("_______________________________________");
        for (int i = 0; i < kola.size(); i++){
            System.out.println(kola.get(i));
        }
        System.out.println("_______________________________________");
        for (var element : kola) {
            System.out.println(element);
        }
        System.out.println("_______________________________________");
        kola.set(0, "Opel");
        System.out.println(kola);
        kola.remove(1);
        System.out.println(kola.size());
        System.out.println(kola);
        kola.clear();
        System.out.println(kola);
    }
}
