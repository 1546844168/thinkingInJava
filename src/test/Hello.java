package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 潇潇暮雨
 * @create 2019-01-04   13:12
 */
public class Hello {

    public static int[] random(int length) {
        List<Integer> list = new ArrayList<Integer>(length);
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("======================");
        Collections.shuffle(list);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] random = random(5);
        System.out.println(Arrays.toString(random));
    }
}
