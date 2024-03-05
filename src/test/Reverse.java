package test;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public List  revInt(List  list) {
if (list.isEmpty()) {
    return list;
}
revInt(list.subList(1, list.size())).add(list.get(0));
list.remove(0);
return list;
    }
}

