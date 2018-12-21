package chapter.nine;

/**
 * @author 江峰
 * @create 2018-12-20 17:06
 */
abstract class A {
    public abstract void a();
}

public class Practice4 extends A {
    public static void f(A a) {

    }

    @Override
    public void a() {
        System.out.println("Practice4  a()");
    }

    public static void main(String[] args) {
        A a = new Practice4();
        a.a();
    }
}
