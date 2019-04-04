package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-03-25   14:45
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("------ liftoff------");
    }
}
