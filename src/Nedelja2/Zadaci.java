package Nedelja2;

public class Zadaci {
    public static void main(String[] args) {

        //1. Написати функцију која од имена и презимена (два прослеђена стринга) враћа иницијале
        //
        //```
        //initials("Pera","Simic"); -> PS
        //initials("Zika", "Peric"); -> ZP
        //```
        //
        //2. Написати функцију која проверава да ли стринг садржи најмање x прослеђених слова
        //
        //```
        //atLeast2("PericaPeric", 'a', 2)
        //```

        System.out.println(initials("Nikola", "Jankovic"));
        System.out.println(atLeast2("NikolaJankovic", 'a', 4));
    }

    public static String initials(String name, String surname) {
        char n = name.charAt(0);
        char s = surname.charAt(0);

        return n + "" + s;

    }


    public static boolean atLeast2(String str, char n, int x) {
        int brojac = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == n)
                brojac += 1;
            if (brojac >= x) {
                return true;
            }
        }
        return false;
    }
}
