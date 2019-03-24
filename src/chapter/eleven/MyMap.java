package chapter.eleven;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 潇潇暮雨
 * @create 2019-03-19   14:25
 */

//class MyComparator implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
//
//        return o1 >= o2 ? (o1 > o2 ? -1 : 0) : 1;
//    }
//}

public class MyMap {


    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 >= o2 ? (o1 > o2 ? -1 : 0) : 1;
            }
        });
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println(map);
    }

}
