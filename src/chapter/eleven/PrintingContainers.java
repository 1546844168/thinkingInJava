package chapter.eleven;

import java.util.*;

/**
 * @author 潇潇暮雨
 * @create 2019-03-08   16:18
 */
public class PrintingContainers {

    public static Collection<String> fill(Collection<String> c) {
        c.add("rat");
        c.add("cat");
        c.add("dog");
        c.add("dog");
        return c;
    }

    public static Map<String, String> fill(Map<String, String> m) {
        m.put("rat", "Fuzzy");
        m.put("cat", "rags");
        m.put("dog", "bosco");
        m.put("dog", "Spot");
        return m;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new HashMap<String, String>()));

    }
}
