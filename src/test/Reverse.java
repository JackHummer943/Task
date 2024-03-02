package test;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    List <Integer> list = new ArrayList<>();
    public List <Integer> reverse(List  <Integer> inputList) {
        if (inputList.size() == 0) {
            return inputList;
        }

       reverse (inputList.subList(1, inputList.size()));
        list.add(inputList.get(0));
        return list;
    }
}

