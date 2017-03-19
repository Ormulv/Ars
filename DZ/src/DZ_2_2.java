/**
 * Created by arseny on 19.03.17.
 */
public class DZ_2_2 {
    public static void main(String[] args) {

        double n = 13.15;
        double m = 11.45;
        int a = 10;
        double b = Math.abs(a-n);
        double c = Math.abs(a-m);
        if (b>c){
            System.out.println(m+"  ближе к "+a);
        }
        if (b<c){
            System.out.println(n+" ближе к "+a);
        }
    }
}
