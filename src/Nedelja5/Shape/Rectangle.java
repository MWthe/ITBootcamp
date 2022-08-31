package Nedelja5.Shape;

public class Rectangle extends Shape{

    Rectangle(Coordinates startCoordinates, double height, double width) {
        super(startCoordinates, height, width);
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
