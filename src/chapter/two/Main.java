package chapter.two;

/**
 * @author 江峰
 * @create 2018-12-10 16:13
 */
public class Main {
    // 类变量,生命周期太长了。
    static int result = 0;

    public static int test(int val1, int val2) {
        if (val1 > val2) {
            result = 1;
            return result;
        } else if (val1 < val2) {
            result = -1;
            return result;
        } else {
            result = 0;
            return result;
        }

    }

    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println("----------------");
        System.out.println(test(10, 10));
        System.out.println("----------------");
        System.out.println(test(5, 10));
    }
}
