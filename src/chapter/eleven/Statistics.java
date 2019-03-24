package chapter.eleven;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author 潇潇暮雨
 * @create 2019-03-10   19:38
 */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(100);
        Integer integer = map.get(1);
        for (int i = 0; i < 10000; i++) {
            int i1 = random.nextInt(20);
//            if (map.containsKey(i1)) {
//                map.put(i1, map.get(i1) + 1);
//                continue;
//            }
//            map.put(i1, 1);
            Integer count = map.get(i1);
            map.put(i1, count == null ? 1 : count + 1);
        }
        System.out.println(map);
    }
}
