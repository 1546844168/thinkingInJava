package chapter.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 潇潇暮雨
 * @create 2019-04-07   19:19
 */

class Count {
    private int count;

    public synchronized int increment() {
        return ++count;
    }

    public synchronized int getCount() {
        return count;
    }
}

class Entrance implements Runnable {
    private static final Count count = new Count();
    private int num = 0;
    private final int id;
    public static volatile boolean canceled = false;
    private static final List<Entrance> list = new ArrayList<Entrance>();

    public Entrance(int id) {
        this.id = id;
        list.add(this);
    }

    @Override
    public void run() {
        while (!canceled) {
            synchronized (this) {
                ++num;
                System.out.println(this + "  total :  " + count.increment());
            }
        }
    }

    public synchronized int getValue() {
        return num;
    }

    @Override
    public String toString() {
        return "Entrance : " + id + "  : " + getValue();
    }

    public static int sumList() {
        int sum = 0;
        for (Entrance entrance : list) {
            int value = entrance.getValue();
            sum += value;
        }
        return sum;
    }

    public static int getTotal() {
        return count.getCount();
    }
}

public class ornamentalGarden {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            es.execute(new Entrance(i));
        }
        try {
            TimeUnit.MILLISECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Entrance.canceled = true;
        es.shutdown();
        System.out.println("sumList: " + Entrance.sumList());
        System.out.println("count:" + Entrance.getTotal());

    }
}
