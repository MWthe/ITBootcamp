package Nedelja5.Zivotinje;

public class Dolphin extends Animals implements Movement {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public int getMovement() {
        return swiming | diving;
    }

    @Override
    public String toString() {
        return "Dolphin{" + name + " }";
    }
}
