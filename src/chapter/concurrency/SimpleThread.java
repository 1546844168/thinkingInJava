package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-04-04   9:46
 */
public class SimpleThread extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;

    public SimpleThread() {
        super(Integer.toString(++threadCount));
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(getName() + "(" + countDown + ")");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread().start();
        }
    }
}
