package chapter.eleven;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 潇潇暮雨
 * @create 2019-03-10   19:13
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            integers.add(rand.nextInt(30));
            System.out.println(integers);
        }

    }
}
