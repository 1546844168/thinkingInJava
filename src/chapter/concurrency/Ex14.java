package chapter.concurrency;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 潇潇暮雨
 * @create 2019-04-07   12:50
 */
public class Ex14 {
    private static int i;

    public static void main(String[] args) {
        for (int j = 0; j < 100; j++) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    i++;
                }
            }, 2000);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
        System.exit(0);
    }

}
