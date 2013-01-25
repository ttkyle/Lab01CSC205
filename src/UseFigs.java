/**
 * Programmer: kyle
 * Date: 1/23/13
 * Time: 4:59 PM
 * Exercise: Lab01-2.10
 */
public class UseFigs {

    public static void main(String[] args) {

        Circle myCircle = new Circle(5);
        System.out.println(myCircle.perimeter());
        System.out.println(myCircle.area());

        Rectangle myRectangle = new Rectangle(7, 8);
        System.out.println(myRectangle.perimeter());
        System.out.println(myRectangle.area());
    }
}
