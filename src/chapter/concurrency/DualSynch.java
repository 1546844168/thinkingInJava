package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-04-07   16:23
 */
public class DualSynch {
    private Object object = new Object();

    public synchronized void f() {
        for (int i = 0; i < 60; i++) {
            System.out.println("f()");
            Thread.yield();
        }
    }

    public synchronized void g() {
        for (int i = 0; i < 60; i++) {
            System.out.println("g()");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        DualSynch ds = new DualSynch();
        new Thread() {
            @Override
            public void run() {
                ds.g();
            }
        }.start();
        ds.f();
    }
}
