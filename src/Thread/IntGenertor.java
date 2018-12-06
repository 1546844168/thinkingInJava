package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-09   10:10
 */
public abstract class IntGenertor {
    private volatile boolean canceled = false;

    abstract int next();

    public void canceled() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
