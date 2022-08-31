package Nedelja5.Zivotinje;

public class Dog extends Animals implements Movement, Sound {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public int getMovement() {
        return walking | jumping;
    }

    @Override
    public void getSound() {
        System.out.println("Av");;
    }

    @Override
    public void getAngrySound() {
        System.out.println("AvAv");
    }

        @Override
    public String toString() {
        return "Dog{" + name +
                "breed='" + breed + '\'' +
                '}';
    }
}

