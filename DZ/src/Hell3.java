/**
 * Created by arseny on 17.03.17.
 */
public class Hell3 {
    public static void main (String[] args){
String text ="hello!";
byte key = 42;

byte[] bytes = text.getBytes();  //text: "hello!"

crypt(text.getBytes(), key);

System.out.println(new String(bytes)); //шифрованный текст

crypt(bytes, key);

System.out.println(new String(bytes)); //hello!
    }

    static void crypt(byte[] bytes, byte key){

    }


}