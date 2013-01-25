/**
 * Programmer: kyle
 * Date: 1/23/13
 * Time: 4:56 PM
 * Exercise: Lab01-2.10
 */
public class Rectangle implements FigureGeometry {

    private double length;
    private double width;
    private int scale;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double perimeter() {
        return (2*(length) + 2*(width));
    }

    public double area() {
        return length * width;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public double weight() {
        return(this.area() * scale);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getScale() {
        return scale;
    }
}
