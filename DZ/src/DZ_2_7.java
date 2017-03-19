/**
 * Created by arseny on 19.03.17.
 */
import java.util.Random;
public class DZ_2_7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(2000),b=a/360;
        System.out.println("Осталось секунд "+a);
        switch (b){
            case 0:
                System.out.println("До конца осталось меньше часа");
                break;
            case 1:
                System.out.println("До конца осталcя "+b+" час");
                break;
            case 2:
            case 3:
                case 4:
                System.out.println("До конца осталось "+b+ " часа");
                break;
            default:
                System.out.println("До конца осталось "+b+" часов");
        }
    }
}
