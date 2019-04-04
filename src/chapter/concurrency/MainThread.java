package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-03-25   14:17
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
    }
}
