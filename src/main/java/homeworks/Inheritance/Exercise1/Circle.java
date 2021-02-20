package homeworks.Inheritance.Exercise1;

public class Circle extends Shape {

    public int radius;
    public int diameter;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
