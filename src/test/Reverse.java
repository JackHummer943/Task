package test;

import java.util.List;

public class Reverse {
    public List reverse(List list) {
        if (list.size() == 0) {
            return list;
        }

        list.add(0, list.remove(list.size() - 1));
        reverse(list.subList(1, list.size()));
        return list;
    }
}