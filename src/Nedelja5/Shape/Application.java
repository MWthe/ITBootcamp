package Nedelja5.Shape;

public class Application {
    public static void main(String[] args) {
        Shape krug = new Circle(new Coordinates(3, 4), 1);
        Shape pravougaonik = new Rectangle(new Coordinates(3, 4), 3, 4);
        Shape kvadrat = new Square(new Coordinates(3, 4), 5);
        Shape trougao = new Triangle(new Coordinates(3, 4), 3, 4, 5);

        System.out.println(krug.getArea());
        System.out.println(pravougaonik.getArea());
        System.out.println(kvadrat.getArea());
        System.out.println(trougao.getArea());

        // sqrt(s * (s-a) * (s-b) * (s-c)
        // s = (a + b + c) / 2
    }
}
