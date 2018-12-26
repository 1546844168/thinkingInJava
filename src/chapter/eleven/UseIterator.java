package chapter.eleven;

import java.util.*;

/**
 * @author 江峰
 * @create 2018-12-25 16:45
 */
public class UseIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        ListIterator<Integer> integerListIterator = list.listIterator();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            iterator.remove();
        }
    }
}

class F {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
    }
}
