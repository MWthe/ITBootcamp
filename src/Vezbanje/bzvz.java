package Vezbanje;

import java.util.Scanner;

public class bzvz {

    // 3. Написати функцију која проверава да ли је Стринг палиндром

    // 4. Написати функцију која проверава да ли је мејл валидан (претпоставити да имамо
    // једно или 0 @ и једна .)
    //     - Мора имати знак `@`
    //     - Мора имати знак `.`
    //     - Пре знака @ мора постојати макар 1 карактер који је слово
    //          - isLetter(char c)
    //     - После знака . мора постојати макар 1 карактер који је слово
    //     - Између @ и . мора постојати макар 1 карактер који је слово

    public static String validEmail(String email) {
        int index = 0;
        int index2 = 0;
        if (!email.contains("@") && !email.contains(".")) {
            return "Unos nije validan.";
        }
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                index = i;
            }
        }
        if (index < 1) return "Unos nije validan.";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '.') {
                index2 = i;
            }
            if (index2 - index == 0) return "Unos nije validan.";
            if (index2 == email.charAt(email.length()-1)) return "Unos nije validan";
        }
        return "Uneli ste validan mail.";
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite mail: ");
        String email = sc.nextLine();
        System.out.println(validEmail(email));;

    }

}

