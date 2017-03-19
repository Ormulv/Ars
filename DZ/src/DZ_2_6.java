/**
 * Created by arseny on 19.03.17.
 */
import java.util.Random;
public class DZ_2_6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100)*-1;
        int b = rand.nextInt(100);
        int c = rand.nextInt(100);
        int x;
        System.out.println("Числа в переменных a b c: "+a+" "+b+ " "+c);
        if (a>b){
            x = a; a = b; b = x; }
            if (b>c){
            x=b; b=c; c=x;
            }
        System.out.println("Последовательность:"+a+" "+b+" "+c);
    }
}
