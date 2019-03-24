package chapter.eleven;

import java.util.Iterator;

/**
 * @author 潇潇暮雨
 * @create 2019-03-19   13:46
 */
public class IterableClass2 implements Iterable {

    String[] arr = "今 晚 夜 色 真 美 ".split(" ");

    public Iterator<String> iterator() {

        return new Iterator<String>() {
            int current = 0;

            @Override
            public boolean hasNext() {
                return current < arr.length;
            }

            @Override
            public String next() {
                return arr[current++];
            }
        };
    }

    public static void main(String[] args) {
        IterableClass2 iterableClass2 = new IterableClass2();
        Iterator<String> iterator = iterableClass2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
