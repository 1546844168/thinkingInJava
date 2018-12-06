package test;

/**
 * @author 潇潇暮雨
 * @create 2018-09-10   13:35
 */
public class WaitTest implements Runnable {
    public void run() {
        f();
    }

    public synchronized void f() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Thread(new WaitTest()).start();
    }
}
