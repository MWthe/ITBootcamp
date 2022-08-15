package Test1;

import java.sql.SQLOutput;

public class Zadatak2 {

    public static int productRange(int n, int m) {
        int product = 1;
        if (n < m) {
            for (int i = n; i <= m; i++) {

                product *= i;
            }
        } else {
            for (int i = m; i <= n; i++) {

                product *= i;
            }
        }
        return product;
    }

    public static void main(String[] args) {

        System.out.println(productRange(5,3));

    }
}
