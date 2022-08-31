package Nedelja5.Zivotinje;

public class Frog extends Animals implements Movement, Sound {

    public Frog(String name) {
        super(name);
    }

    @Override
    public int getMovement() {
        return jumping | swiming | diving;
    }

    @Override
    public void getSound() {
        System.out.println("Frog sound");
    }

    @Override
    public void getAngrySound() {
        System.out.println("Frog angry sound");
    }

    @Override
    public String toString() {
        return "Frog{ " + name + " }";
    }
}
