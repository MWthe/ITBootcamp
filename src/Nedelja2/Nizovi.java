package Nedelja2;

public class Nizovi {
    public static void main(String[] args) {
        int  [] niz = {2, 14, 15, 125, 54, 36};
        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }
        System.out.println(suma);
    }
}
