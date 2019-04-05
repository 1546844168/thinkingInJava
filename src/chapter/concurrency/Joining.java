package chapter.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * @author 潇潇暮雨
 * @create 2019-04-04   11:37
 */


class Sleeper extends Thread {
    private int sleepTime;

    public Sleeper(String name, int sleepTime) {
        super(name);
        this.sleepTime = sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println(getName() + " : " + isInterrupted());
            return;
        }
        System.out.println(getName() + "睡眠结束");
    }

}

class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println(getName() + "中断");
        }
        System.out.println(getName() + "joined completed");
    }
}

public class Joining {
    public static void main(String[] args) {
        Sleeper sleeper1 = new Sleeper("sleeper1", 1000);
        Sleeper sleeper2 = new Sleeper("sleeper2", 1000);
        Joiner join1 = new Joiner("join1", sleeper1);
        Joiner join2 = new Joiner("join2", sleeper2);
        sleeper1.interrupt();
    }

}
