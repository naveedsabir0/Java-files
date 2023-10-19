package defaultpackage;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(4.0, 3.0);

        circle.setColor("Red");
        triangle.setColor("Blue");

        System.out.println("Circle - Color: " + circle.getColor() + ", Area: " + circle.area() + ", Perimeter: " + circle.perimeter());
        System.out.println("Triangle - Color: " + triangle.getColor() + ", Area: " + triangle.area());
    }
}
