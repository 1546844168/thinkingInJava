package chapter.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author 潇潇暮雨
 * @create 2019-02-07   21:34
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] arr = {6, 7, 8, 9, 10};
        c.addAll(Arrays.asList(arr));
        Collections.addAll(c, 11, 12, 13, 14, 15);
        Collections.addAll(c, arr);

    }
}
