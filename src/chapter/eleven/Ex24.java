package chapter.eleven;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 潇潇暮雨
 * @create 2019-03-10   21:14
 */
public class Ex24 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("d", "ddd");
        map.put("d", "ddd");
        map.put("c", "ccc");
        System.out.println(map);
        Map<String, String> m2 = new LinkedHashMap<String, String>();
        Set<String> strings = map.keySet();
        TreeSet<String> strings1 = new TreeSet<>(strings);
        for (String s : strings1) {
            m2.put(s, map.get(s));
        }
        System.out.println(m2);
    }
}
