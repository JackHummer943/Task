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
    alist.add(4);
    alist.add(5);
    List revList = rev.revInt(alist);
    System.out.println(revList.toString());

    }
}
