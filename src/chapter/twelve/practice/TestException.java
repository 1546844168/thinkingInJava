package chapter.twelve.practice;

import java.lang.reflect.Array;

/**
 * @author 潇潇暮雨
 * @create 2019-03-06   10:18
 */
public class TestException {
    public static void main(String[] args) {
        try {
            throw new Exception("抛出了异常");
        } catch (Exception e) {
            System.out.println("catch it");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("fianlly一定会被执行");
        }
    }
}

class A {
    public static void main(String[] args) {
        try {
            fun();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fun() throws Exception {
        try {
            A a = null;
            a.getClass();
        } catch (Exception e) {
            throw e;
        }
        System.out.println("continue");
    }
}

class C {
    public static void fun() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        fun();
        System.out.println("hello");
    }
}
