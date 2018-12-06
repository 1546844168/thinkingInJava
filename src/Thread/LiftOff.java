package Thread;

/**
 * @author 潇潇暮雨
 * @create 2018-09-07   23:35
 */
public class LiftOff implements Runnable{
    protected int countDown = 10;
    private static int taskCount = 0;
    // 标志服id可以用来区分任务的多个实例，final修饰，一经创建就不会再被修改
    private final int id = taskCount++;

    public void state(){
        System.out.println(id +" :  "+ (countDown > 0?countDown : "liftOff"));
    }

    @Override
    public void run() {
        while (countDown-- > 0){
            state();
        Thread.yield();
        }
    }
    public static void main(String[] args){
//        LiftOff liftOff = new LiftOff();
//        liftOff.run();
        for (int i = 0; i < 3; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("exit");
    }
}
