package Nedelja4;

public class Osoba {

    /*
napravi klasu osoba
atributi : ime, prezime, godRodjena, pol
metode : get,set svih atributa
 */

 // atributi

    String ime;
    String prezime;
    int godRodjenja;
    String pol;

    //konstruktor
    public Osoba(){

    }
    public Osoba (String ime, String prezime, int godRodjenja, String pol){
        this.ime = ime;
        this.prezime = prezime;
        this.godRodjenja = godRodjenja;
        this.pol = pol;
    }

        // metode
    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
    public int getGodRodjenja() {
        return godRodjenja;
    }

    public String getPol() {
        return pol;
    }

    public String setIme(String ime) {
        return this.ime = ime;
    }

    public String setPrezime(String prezime) {
        return this.prezime = prezime;
    }

    public int setGodRodjenja(int godRodjenja) {
        return this.godRodjenja = godRodjenja;
    }

    public String setPol(String pol) {
        return this.pol = pol;
    }


}
