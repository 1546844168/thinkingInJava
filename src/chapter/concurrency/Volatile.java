package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-04-06   22:35
 */
public class Volatile implements Runnable {
    private boolean canceled = false;

    @Override
    public void run() {
        while (true) {
            if (!canceled) {
                System.out.println(Thread.currentThread().getName());
            } else {

            }
        }
    }
}
