package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 潇潇暮雨
 * @create 2018-09-09   14:46
 */
public class MutexEvenGenerator extends IntGenertor {
    private int val = 0;
    private Lock lock = new ReentrantLock();

    @Override
    public int next() {
        lock.lock();
        try {
            ++val;  //此处会引发线程安全问题,通过加锁解决。
            ++val;
            return val;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return -1;
    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenGenerator());
    }
}
