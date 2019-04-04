package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-03-25   14:43
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("   ---- lift off ------");
    }
}
