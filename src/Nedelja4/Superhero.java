package Nedelja4;

public class Superhero extends Person {

    //Klasa SuperHeroj nasleđuje klasu Osoba, superMoc, superHerojIme
//konstruktori, get/set metode za ove atribute, toString

    static {System.out.println("Osoba je SuperHeroj");}

    String superMoc;
    String superHerojIme;


    Superhero (String firstName, String lastName, int birthYear, String job, String superMoc, String superHerojIme) {
         super(firstName, lastName,birthYear, job);
         this.superMoc = superMoc;
         this.superHerojIme = superHerojIme;
    }

    public String getSuperHerojIme() {
        return superHerojIme;
    }

    public String getSuperMoc() {
        return superMoc;
    }

    public void setSuperHerojIme(String superHerojIme) {
        this.superHerojIme = superHerojIme;
    }

    public void setSuperMoc(String superMoc) {
        this.superMoc = superMoc;
    }

    public String toString(){
        return super.toString() + " njegova moc je " + superMoc + " a njegovo super ime " + superHerojIme;
    }
}
