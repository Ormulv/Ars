/**
 * Created by arseny on 19.03.17.
 */
import java.util.Random;
public class DZ_2_1 {
    public static void main(String[] args) {

        System.out.println("Задание 1:");
        Random rand = new Random();

        int num = rand.nextInt(100);
        String type = num % 2 == 0 ? "Число " +num +" четное" : "Число " +num +" не четное";
        System.out.println(type);
    }
}