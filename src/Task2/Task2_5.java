package Task2;

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.in;

public class Task2_5 {
    public static void main(String[] args) {
       Scanner id = new Scanner(System.in);
       int n = id.nextInt();
       String m = Integer.toString(n);
       int k = m.length();
       if(n < 1000) {
           System.out.println("Число меньше 1 000, число тысяч - 0");
       } else if (n > 10000){
           System.out.println("Число не входит в диапазон от 1000 до 10000");
       } else {
           PrintStream value10000 = System.out;
           char value10001 = m.charAt(k - 4);
           value10000.println("Число тысяч - " + value10001);
       }

    }
}
