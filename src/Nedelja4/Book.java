package Nedelja4;

//Napraviti klasu Knjiga koja opisuje knjigu. Od privatnih polja, klasa sadrzi:
//        • String naslov, naslov knjige
//        • Autor autor, autora knjige
//        • double ocena, prosecna ocena knjige, najmanje 0, najvise 10
//        Konstruktor za klasu je oblika:
//        • Knjiga(String naslov, Autor autor, double ocena)
//        Od metoda, klasa sadrzi:
//        • String getNaslov()
//        • Autor getAutor()
//        • double getOcena()
//        • String toString(), koji vraca stringovnu reprezentaciju knjige.

public class Book {
    String book;
    String autor;
    double ocena;

    public Book() {
    }
    public Book(String book, String autor, double ocena) {
        this.book = book;
        this.autor = autor;
        this.ocena = ocena;
    }
    public String getBook() {
        return book;
    }
    public String getAutor() {
        return autor;
    }
    public double getOcena() {
        return ocena;
    }
    @Override
    public String toString() {
        return  "Knjiga: " + book + "\nOcena: " + ocena + "\nAutor: " + autor;
    }
}
