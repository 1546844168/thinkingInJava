package chapter.eleven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author 江峰
 * @create 2018-12-25 15:47
 */
public class CollectionGeneric {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            c.add(i);
        }
        System.out.println(c);
        method1();
        System.out.println("---------------------------");
        method1();
    }

    public static void method2() {
        Collection<Integer> c = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            c.add(i);
        }
        for (Integer integer : c) {
            System.out.println(integer);
        }
    }

    public static void method1() {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            c.add(i);
        }
        for (Integer integer : c) {
            System.out.println(integer);
        }
    }
}

interface A {
    void fun();
}

class B implements A {

    @Override
    public void fun() {

    }

    public void f() {
        System.out.println("B f()");
    }

    public void g(A a) {
        a.fun();
    }

    public static void main(String[] args) {
        A a = new B();
        ((B) a).fun();
    }
}
