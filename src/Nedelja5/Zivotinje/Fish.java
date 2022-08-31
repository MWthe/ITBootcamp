package Nedelja5.Zivotinje;

public class Fish extends Animals implements Movement{
    public Fish(String name) {
        super(name);
    }

    @Override
    public int getMovement() {
        return swiming|diving;
    }


}
