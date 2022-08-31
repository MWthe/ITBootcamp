package Nedelja5.Shape;
// sqrt(s * (s-a) * (s-b) * (s-c)
// s = (a + b + c) / 2

public class Triangle extends Shape {
    double c;

    Triangle(Coordinates startCoordinates, double height, double width, double c) {
        super(startCoordinates, height, width);
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (height + width + c) / 2;
        return Math.sqrt(s * (s-height) * (s-width) * (s-c));
    }
}
