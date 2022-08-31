package Nedelja5.Shape;

public class Square extends Shape{


    Square(Coordinates startCoordinates, double height) {
        super(startCoordinates, height, 1*height);
    }

    @Override
    public double getArea() {
        return height*height;
    }
}
