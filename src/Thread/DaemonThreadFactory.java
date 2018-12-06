package Thread;

import java.util.concurrent.ThreadFactory;

/**
 * @author 潇潇暮雨
 * @create 2018-09-08   16:45
 *
 *
 * 后台线程工厂
 */
public class DaemonThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}



















