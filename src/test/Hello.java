package test;

/**
 * @author 潇潇暮雨
 * @create 2019-01-04   13:12
 */

class A {
    private static int i;

    public Integer getI() {
        i++;
        return i;
    }
}

class B implements Runnable {
    private A a;

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(a.getI());
        }
    }
}

class C implements Runnable {
    private A a;

    public C(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(a.getI());
        }
    }
}

public class Hello {
    public static void main(String[] args) {
        A a = new A();
        new Thread(new C(a)).start();
        new Thread(new B(a)).start();
    }
}
