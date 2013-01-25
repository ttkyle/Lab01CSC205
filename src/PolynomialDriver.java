/**
 * Programmer: kyle
 * Date: 1/23/13
 * Time: 3:40 PM
 * Exercise:Lab01-1.26
 */
public class PolynomialDriver {

    public static void main(String[] args) {

        Polynomial myPoly = new Polynomial(3);
        myPoly.setCoefficients(3, 5);
        myPoly.setCoefficients(1, 2);
        myPoly.setCoefficients(0, -3);

        System.out.println(myPoly.evaluate(0));
        System.out.println(myPoly.evaluate(1));
        System.out.println(myPoly.evaluate(0.5));

        //answer is 632
        System.out.println(myPoly.evaluate(5));

        System.out.println("The degree of the polynomial is " + myPoly.getDegree() + ".");

    }
}
