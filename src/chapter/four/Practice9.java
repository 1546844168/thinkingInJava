package chapter.four;

/**
 * @author 江峰
 * @create 2018-12-13 15:25
 */

/**
 * 写一个方法，接受一个参数，写出从第一个开始该参数指定的个数的所有的斐波那契数列。
 * 1 1 2 3 5 8 13 21
 */
public class Practice9 {

    public static void fibonacci(int num) {
        int first = 1;
        int two = 1;
        int count = 3;
        // 每一个数都是前两个数之和
        int last = 2;
        System.out.println(first);
        System.out.println(two);
        while (count <= num) {
            System.out.println(last);
            first = two;
            two = last;
            last = first + two;
            count++;
        }

    }

    public static void main(String[] args) {
        fibonacci(8);
    }

}
