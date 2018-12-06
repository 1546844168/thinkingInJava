package Thread;

import java.util.concurrent.*;

/**
 * @author
 * @create 2018-09-08   14:06
 */
public class TaskWithResults implements Callable {
    private int id;

    public TaskWithResults(int id) {
        this.id = id;
    }


    @Override
    public String call() throws Exception {
        System.out.println(id + ": 执行");
        return "id: " + id;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 6; i++) {
            Future future = exec.submit(new TaskWithResults(i));
            System.out.println(future.get());
        }
        exec.shutdown();
    }
}
