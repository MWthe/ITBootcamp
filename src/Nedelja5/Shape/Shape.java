package Nedelja5.Shape;

public abstract class Shape {
    private Coordinates startCoordinates;
    protected double height;
    protected double width;

    public Shape(Coordinates startCoordinates, double height, double width) {
        this.startCoordinates = startCoordinates;
        this.height = height;
        this.width = width;
    }

    public Coordinates getStartCoordinates() {
        return startCoordinates;
    }

    public void setStartCoordinates(Coordinates startCoordinates) {
        this.startCoordinates = startCoordinates;
    }

    public abstract double getArea();
}
