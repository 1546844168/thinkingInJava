package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-04-06   10:50
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    abstract public int next();

    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
