package Blog;

import Blog.users.User;

import java.util.HashMap;
import java.util.Scanner;

//9. Направити класу Blog која ради са свим претходним класама:
//     - Омогућава пријављивање корисника
//     - Омогућава испис свих објава
//
//     - Ако је тренутни корисник обичан корисник (Regular) (getPermissionLevel)
//         - Омогућава приказ коментара за објаву са одређеним `id`
//             - Омогућава брисање сопствених коментара
//         - Омогућава коментарисање објаве са одређеним `id`
//         - Омогућава испис објава тренутног корисника
//         - Омогућава брисање објаве тренутног корисника
//         - Омогућава прављење нове објаве
//     - Ако је тренутни корисник модератор (Moderator)
//         - Омогућава брисање било ког коментара
//     - Ако је тренутни корисник администратор (Admin)
//         - Омогућава брисање било ког коментара
//         - Омогућава брисање било које објаве

public class Blog {
    private User currentUser;

    public static void printRegisteredUsers() {
    }

    public void login() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Унесите username: ");
        var username = sc.nextLine();
        System.out.println("Унесите password: ");
        var password = sc.nextLine();

        currentUser = Database.getUser(username, password);
        // Провера, try/catch/exception, do while, максимално 4 покушаја
    }

}
