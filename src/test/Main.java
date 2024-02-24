package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*reverse[1,2,3]
[3,2,1]*/
    Reverse rev = new Reverse();
    List <Integer> alist = new ArrayList<>();
    alist.add(1);
    alist.add(2);
    alist.add(3);
    List revList = rev.reverse(alist);
    System.out.println(revList.toString());

    }
}
