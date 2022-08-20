package Nedelja4;

public class Person {

    //Klasa Osoba
//atribute: ime, prezime, godRodjenja, zanimanje
//konstruktori, get/set metode za ove atribute, toString
    static{System.out.println("Osoba nije SuperHeroj");}

    String firstName;
    String lastName;
    int birthYear;
    String job;

    Person() {

    }

    Person(String firstName, String lastName, int birthYear, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getJob() {
        return job;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Osoba " + firstName + " " + lastName + " rodjena je  " + birthYear + " i po zanimanju je " + job;
    }
}
