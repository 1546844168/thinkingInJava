package chapterSeven;

/**
 * @author 江峰
 * @create 2018-12-19 13:11
 */
class Base {

    public void fun() {
        System.out.println("fun");
    }

    public void fun(int i) {
        System.out.println(i + " fun (int)");
    }

    public void fun(char c) {
        System.out.println(c + " fun (char)");

    }

    public void fun(float f) {
        System.out.println(f + " fun(float)");
    }

}

public class Override extends Base {

    public void fun(long l) {
        System.out.println(l + " fun (long)");

    }

    @java.lang.Override
    public void fun(int i) {
        System.out.println(i + "  Override fun(int)");
    }

    public static void main(String[] args) {
        Override override = new Override();
        override.fun();
        override.fun(1);
        override.fun('c');
        override.fun(1.0f);
        override.fun(1L);
    }
}
