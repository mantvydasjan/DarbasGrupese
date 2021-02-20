package homeworks.Inheritance.Exercise1;

public class Shape {

    protected int area;
    protected int perimeter = 11;
    protected String color;
    protected boolean isColorful = true;



    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isColorful() {
        return isColorful;
    }

    public void setColorful(boolean colorful) {
        isColorful = colorful;
    }
    public Shape(int area, int perimeter, String color, boolean isColorful) {
        this.area = area;
        this.perimeter = perimeter;
        this.color = color;
        this.isColorful = isColorful;
    }

    public Shape() {

    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", color='" + color + '\'' +
                ", isColorful=" + isColorful +
                '}';
    }
}
