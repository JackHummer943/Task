package Task2;

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.in;

public class Task2_5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(in);
        long m = (long)id.nextDouble();
        String n = Long.toString(m);
        int k = n.length();
        if(m < 1000L) {
            System.out.println("Число меньше 1 000");
        } else {
            PrintStream value10000 = System.out;
            char value10001 = n.charAt(k - 4);
            value10000.println("Число тысяч - " + value10001);
        }
    }
}
