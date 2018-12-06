package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2018-09-09   17:16
 */
public class AutomictyTest implements Runnable {
    // 没有用volatile来修饰，会引发可视性问题。
    private int val = 0;

    public synchronized void change() {
        val++;
        val++;
    }
    // 这个方法应该用synchronized来修饰。
    public int getVal() {
        return val;
    }

    public void run() {
        while (true) {
            change();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        AutomictyTest at = new AutomictyTest();
        exec.execute(at);
        while (true) {
            int val = at.getVal();
            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }

}
