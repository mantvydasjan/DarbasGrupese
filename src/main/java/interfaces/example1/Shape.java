package interfaces.example1;

//Kontrakas
public interface Shape {

    ShapeFormat format = ShapeFormat.TWO_DIMENTIONAL;

    public abstract void getArea();
    public abstract void getPerimeter();
    String getFormat();

    default void print() {
        System.out.println("Shape " + this);



    }


}
