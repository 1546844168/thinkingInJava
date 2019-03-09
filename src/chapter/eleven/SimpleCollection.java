package chapter.eleven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

/**
 * @author 潇潇暮雨
 * @create 2019-02-07   20:54
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer integer : c) {
            System.out.println(integer);
        }
    }
}


class SimpleCollection1 {
    public static void main(String[] args) {
        Collection<Integer> c = new TreeSet<Integer>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.println(i);
        }
    }
}
