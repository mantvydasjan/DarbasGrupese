package homeworks.Inheritance.Exercise1;

public class Rectangle extends Shape {

    public int length;
    public int width;

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
