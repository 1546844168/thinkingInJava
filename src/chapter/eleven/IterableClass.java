package chapter.eleven;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

/**
 * @author 潇潇暮雨
 * @create 2019-03-14   23:55
 */
public class IterableClass implements Iterable<String> {

    protected String[] arr = "今 晚 夜 色 真 美 ".split(" ");

    @NotNull
    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < arr.length;
            }

            @Override
            public String next() {
                return arr[index++];
            }
        };
    }

    public static void main(String[] args) {
        Iterator<String> iterator = new IterableClass().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
