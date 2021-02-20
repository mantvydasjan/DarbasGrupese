package homeworks.Inheritance.Exercise1;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.setArea(50);

        Circle circle = new Circle();

        Rectangle rectangle = new Rectangle();

        System.out.println(shape);

        System.out.println(circle.area);

    }
}
