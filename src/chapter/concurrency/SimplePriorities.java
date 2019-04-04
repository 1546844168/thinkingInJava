package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-03-26   10:25
 */
public class SimplePriorities implements Runnable {
    private int priority;

    public SimplePriorities(int priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        for (int i = 0; i < 60; i++) {
            System.out.println(Thread.currentThread().getPriority() + " : " + Thread.currentThread().getName());
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        System.out.println("go");
        new Thread(new SimplePriorities(Thread.MIN_PRIORITY)).start();
        new Thread(new SimplePriorities(Thread.NORM_PRIORITY)).start();
        new Thread(new SimplePriorities(Thread.MAX_PRIORITY)).start();
        System.out.println("exit");
    }
}
