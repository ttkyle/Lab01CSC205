
/**
 * Programmer: kyle
 * Date: 1/23/13
 * Time: 4:30 PM
 * Exercise: Lab01-1.44
 */
public class Question44 {

    public static void main(String[] args) {
        Date[] question44 = new Date[10];
        for(int i = 0; i < question44.length; i++) {
            question44[i] = new Date(2005, 12, i + 1);
        }
        for(int n = 0; n < question44.length; n++) {
            System.out.println(question44[n]);
        }
    }
}
