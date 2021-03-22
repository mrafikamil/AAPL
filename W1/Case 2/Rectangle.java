
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public String toString() {
        return super.toString() + " of area " + area();
    }
}
