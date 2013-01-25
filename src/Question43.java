/**
 * Programmer: kyle
 * Date: 1/23/13
 * Time: 4:18 PM
 * Exercise: Lab01-1.43
 */
public class Question43 {

    public static void main(String[] args) {
        int[] question43 = new int[10];
        for(int i = 0; i < question43.length; i++) {
            question43[i] = (int) Math.pow(i, 2);
        }
        for(int n = 0; n < question43.length; n++) {
            System.out.println(question43[n]);
        }
    }
}
