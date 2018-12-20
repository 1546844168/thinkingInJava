package chapter.five;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 江峰
 * @create 2018-12-17 20:23
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] arr = new Integer[rand.nextInt(20)];
        // 其实这样写是不科学的，自动装箱拆箱会浪费很多时间。
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("the length of arr is " + arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
