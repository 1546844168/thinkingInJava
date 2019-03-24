package chapter.eleven;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 潇潇暮雨
 * @create 2019-03-19   13:11
 */
public class ReversibleArrayList extends ArrayList<String> {
    public ReversibleArrayList() {

    }

    public ReversibleArrayList(Collection<String> c) {
        super(c);
    }

    public Iterable<String> reverse() {

        return new Iterable<String>() {
            @NotNull
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return get(current--);
                    }
                };
            }
        };
    }

    public Iterator<String> rev() {
        return new Iterator<String>() {
            int current = size() - 1;

            @Override
            public boolean hasNext() {
                return current > -1;
            }

            @Override
            public String next() {
                return get(current--);
            }
        };
    }

    public static void main(String[] args) {
        ReversibleArrayList strings = new ReversibleArrayList(Arrays.asList("今 晚 夜 色 真 美 ".split(" ")));
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(strings);

        //        for (Iterator<String> it = strings.rev(); it.hasNext(); ) {
//            String string = it.next();
//            System.out.println(string);
//
//        }
        for (String s : strings.reverse()) {
            System.out.println(s);
        }
    }
}
