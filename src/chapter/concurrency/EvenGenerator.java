package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-04-06   10:54
 */
public class EvenGenerator extends IntGenerator {
    private int i;

    @Override
    public int next() {
        synchronized (this) {
            i++;
            // 建议线程进行切换
            Thread.yield();
            i++;
            return i;
        }
    }
}
