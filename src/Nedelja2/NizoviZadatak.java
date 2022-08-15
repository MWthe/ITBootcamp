package Nedelja2;

public class NizoviZadatak {
    static int [] niz1 = {3234,12,124,6,126,2,22,661};

    public static boolean ifTherIs (int element, int[] niz1) {
        for (int num : niz1) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(ifTherIs(126, niz1));
    }
}
