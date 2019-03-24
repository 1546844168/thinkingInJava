package chapter.thirteen;

import java.util.ArrayList;

/**
 * @author 潇潇暮雨
 * @create 2019-03-19   16:00
 */
public class InfiniteRecursion {
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ArrayList<InfiniteRecursion> infiniteRecursions = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            infiniteRecursions.add(new InfiniteRecursion());
        }
        System.out.println(infiniteRecursions.toString());
    }

}
