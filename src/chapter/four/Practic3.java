package chapter.four;

/**
 * @author 江峰
 * @create 2018-12-12 16:15
 */

/**
 * 打印1 - 100 的素数
 */
public class Practic3 {

    public static void fun() {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        fun();
    }
}
