package chapter.eleven;

import java.util.ArrayList;

/**
 * @author 江峰
 * @create 2018-12-25 15:21
 */

class Apple {
    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

public class AppleGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        for (Apple apple : apples) {
            System.out.println(apple.id());
        }
    }
}
