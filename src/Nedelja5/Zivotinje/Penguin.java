package Nedelja5.Zivotinje;

public class Penguin extends Animals implements Movement, Sound {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public int getMovement() {
        return walking | swiming | diving;
    }

    @Override
    public void getSound() {
        System.out.println("Penguin sound");
    }

    @Override
    public void getAngrySound() {
        System.out.println("Penguin sound");
    }
}
