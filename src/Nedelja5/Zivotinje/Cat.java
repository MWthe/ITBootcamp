package Nedelja5.Zivotinje;

public class Cat extends Animals implements Movement, Sound {
    private String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public int getMovement() {
        return walking | jumping;
    }

    @Override
    public void getSound() {
        System.out.println("Mjau");
    }

    @Override
    public void getAngrySound() {
        System.out.println("Mjjjauu");
    }

    @Override
    public String toString() {
        return "Cat{" + name +
                "breed='" + breed + '\'' +
                '}';
    }
}
