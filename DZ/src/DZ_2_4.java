/**
 * Created by arseny on 19.03.17.
 */
public class DZ_2_4 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*150+1)+5;
        if (a<=25||a>100){
            System.out.println("Число "+a+ " не содержится в интерввале от 25 до 100");
        }
        else {
            System.out.println("Число "+a+ " содержится в интервале от 25 до 100");
        }
    }
}
