package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-04-07   9:56
 */
public class Automicity implements Runnable {
    int i = 0;
    boolean flag = false;

    synchronized int fun() {
        return ++i;
    }

    @Override
    public void run() {
        while (!flag) {
            int val = fun();
            System.out.println(val);
            if (val == 1000) {
                // 这里可能会出现线程安全问题。因为内存可见性。
                flag = true;
            }

        }
    }

    public static void main(String[] args) {
        Automicity ac = new Automicity();
        new Thread(ac).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ac.i + " ------- ");
    }
}
