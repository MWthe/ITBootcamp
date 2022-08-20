package Nedelja4;

//Napisati funkciju main u kojoj je potrebno napraviti sledece knjige1:
//        • Robert Dzordan, Zenica Sveta, 9.7
//        • Daniel Suarez, Demon, 9.5
//        • Daniel Suarez, Sloboda, 9.1
//        A pomenuti autori su:
//        • Robert Dzordan
//        • Daniel Suarez

public class Main {
    public static void main(String[] args) {

//        Book book1 = new Book("Zenica sveta", "Robert Dzordan", 9.7);
//        Book book2 = new Book("Demon", "Daniel Suarez", 9.5);
//        Book book3 = new Book("Sloboda", "Daniel Suarez", 9.1);
//
//        System.out.println(book1);
//        System.out.println();
//        System.out.println(book2);
//        System.out.println();
//        System.out.println(book3);
////////////////////////////////////////////////////////////////////////////////////

        Person p1 = new Person("Nikola", "Jankovic", 1993, "Gradjevinski inzenjer");
        System.out.println(p1);
        Superhero p2 = new Superhero("Nikola", "Jankovic", 1993, "Gradjevinski inzenjer", "Programer", "Itbootcamp");
        System.out.println(p2);
    }
}
