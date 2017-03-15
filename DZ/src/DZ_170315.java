
/**
 * Created by Laptev on 15.03.2017.
 */
public class HomeWork {
    public static void main(String[] args) {
        //я кодю как мудак, задание №1
        int q = 21;
        int w = 8;
        int a = q/w;
        int b = q%w;
        System.out.println("Задание №1");
        System.out.println("Делим " +q +" на " +w +" ,получается " +a +","+b +".");

        //задание №2
        int e = 34;
        System.out.println("Задание №2 ");
        System.out.print("Сумма двух чисел будет равна ");
        System.out.println((e%10)+((e/10)%10));

        //задание №3
        System.out.println("Задание №3 ");
        double n = 3.47;
        int x = (int)(n + 0.5);
        System.out.println(x);

        //задание №4
        int k = 123;
        System.out.println("Задание №4 ");
        System.out.print("Сумма трех чисел будет равна: ");
        System.out.println((k%10)+((k/10)%10)+((k/100)%10));

        //задание №5
        System.out.println("Задание №5 ");
        int z = 87;
        System.out.println("Число " +z);
        if(z % 2 ==0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
