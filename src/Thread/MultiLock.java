package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-10   10:32
 */
public class MultiLock {

    public synchronized void f(int count) {
        if (count-- > 0)
            System.out.println(count);
        g(count);
    }

    public synchronized void g(int count) {
        if (count-- > 0)
            System.out.println(count);
        f(count);
    }

    public static void main(String[] args) {
        MultiLock lock = new MultiLock();
        new Thread() {
            public void run() {
                lock.f(10);
            }
        }.start();

    }
}
