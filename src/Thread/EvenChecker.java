package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 潇潇暮雨
 * @create 2018-09-09   10:15
 */
public class EvenChecker implements Runnable {
    private IntGenertor genertor;
    private final int id;

    public EvenChecker(IntGenertor genertor, int id) {
        this.genertor = genertor;
        this.id = id;
    }

    public void run() {
        System.out.println("ctrl + c to canceled");
        while (!genertor.isCanceled()) {
            int val = genertor.next();
            if ( val %2 != 0){
                System.out.println("出现了不是2的倍数的数了");
                genertor.canceled();
            }
        }
    }
    public static void test(IntGenertor genertor, int count){
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(genertor,i));
        }
        exec.shutdown();;
    }

    public static void test(IntGenertor genertor){
        test(genertor, 10);
    }
}
