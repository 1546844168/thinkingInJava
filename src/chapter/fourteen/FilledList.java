package chapter.fourteen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 潇潇暮雨
 * @create 2019-03-20   15:43
 */
class CountedInteger {
    private static int count = 0;
    private final int id = count++;

    public String toString() {
        return Integer.toString(id);
    }
}

public class FilledList<T> {
    private Class<T> type = null;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> filled(int num) {
        List<T> list = new ArrayList<T>();
        for (int i = 0; i < num; i++) {
            try {
                list.add(type.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<CountedInteger> filled = new FilledList<CountedInteger>(CountedInteger.class).filled(15);
        System.out.println(filled);
    }
}
