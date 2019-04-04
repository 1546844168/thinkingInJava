package chapter.fourteen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 潇潇暮雨
 * @create 2019-03-21   22:58
 */
public class Hello {
    /**
     * 不用判断查询数组中的奇数
     *
     * @param arr
     * @return
     */
    public static List<Integer> queryOddNumber(int[] arr) {
        ArrayList<Integer> integers = new ArrayList<>();
        int odd = 0;
        for (int i : arr) {
            try {
                odd = 1 / (i % 2);
            } catch (ArithmeticException a) {
                continue;
            }
            integers.add(i);
        }
        return integers;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 11, 13, 14};
        List<Integer> integers = queryOddNumber(arr);
        System.out.println(integers);
    }
}
