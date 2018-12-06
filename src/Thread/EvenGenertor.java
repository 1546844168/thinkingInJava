package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-09   10:28
 */
public class EvenGenertor extends IntGenertor {
    private int val = 0;

    @Override
    public synchronized int next() {
        ++val;
        Thread.yield();
        ++val;
        return val;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenertor());
    }
}
