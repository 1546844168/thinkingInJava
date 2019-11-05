package nobug;

import java.util.ArrayList;

/**
 * @author 江峰
 * @create 2019-11-04   10:34
 */
public class A {
    double d = 0.2d;
    boolean flag;

    void f() {
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                return;
            }
            System.out.println("i = " + i);
        }
    }

    void g() {
        f();
        System.out.println("exit f()");
    }

    public static void main(String[] args) {
        A a = new A();
        a.g();
    }
}
