package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-03-25   13:49
 */
public class LiftOff implements Runnable {
    protected int countdown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countdown) {
        this.countdown = countdown;
    }

    public String status() {
        return "#" + id + "(" + (countdown > 0 ? countdown : "liftOff") + ")";
    }

    @Override
    public void run() {
        while (countdown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }

}

