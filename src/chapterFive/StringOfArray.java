package chapterFive;

import java.util.Arrays;

/**
 * @author 江峰
 * @create 2018-12-17 20:32
 */
public class StringOfArray {
    public static void main(String[] args) {
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "count" + i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
