package test;

import java.util.List;

public class Reverse {
   public List reverse(List list) {
       // пустой лист - пустой список
       // не пустой список - список
       // в качестве терминирующего значения - пустой список
       // [1,2,3] => 1 [2,3]
       // [2,3]++1 => [2,3,1]
       // [2,3] => [3,2]
       // [3,2]++1 -> [3,2,1]
       // Псевдокод
       // reverse[] -> []
       // reverse[head + tail] -> reverse [tail]++ head
    if (list.size() == 0){
        return list;
    }

       reverse(list.subList(1, list.size())).add(list.get(0));
       return list;
   }
}
