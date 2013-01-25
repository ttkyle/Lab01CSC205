/**
 * Programmer: kyle
 * Date: 1/23/13
 * Time: 4:45 PM
 * Exercise: Lab01-2.10
 */
public class Circle implements FigureGeometry {

    private double radius;
    private double scale;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public double weight() {
        return(this.area() * scale);
    }

    public double getRadius() {
        return radius;
    }

    public double getScale() {
        return scale;
    }
}
