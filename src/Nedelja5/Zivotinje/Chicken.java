package Nedelja5.Zivotinje;

public class Chicken extends Animals implements Movement, Sound {

    public Chicken(String name) {
        super(name);
    }

    @Override
    public int getMovement() {
        return walking | flying | swiming | diving;
    }

    @Override
    public void getSound() {
        System.out.println("Kva");
    }

    @Override
    public void getAngrySound() {
        System.out.println("KvaKva");
    }

    @Override
    public String toString() {
        return "Chicken{ " + name + " }";
    }
}
