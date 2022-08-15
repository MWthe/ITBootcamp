package Test1;

public class Zadatak1 {
    public static void tablicaMnozenja(int n) {
        int tablica = 1;
        for (int i =1; i< 10; i++){
            tablica = i * n;
            System.out.println(i + "*" + n + " = " + tablica);
        }
    }

    public static void main(String[] args) {

        tablicaMnozenja(5);
    }
}
