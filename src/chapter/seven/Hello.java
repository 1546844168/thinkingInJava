package chapter.seven;

/**
 * @author 江峰
 * @create 2018-12-19 22:12
 */

public class Hello {
    private static int i = fun(1);

    public static int fun(int i) {
        System.out.println("加载了类");
        return i;
    }

    public static void main(String[] args) {
        new Hello();
        new Hello();
        new Hello();
    }
}
