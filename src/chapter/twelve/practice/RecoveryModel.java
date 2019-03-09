package chapter.twelve.practice;

/**
 * @author 潇潇暮雨
 * @create 2019-03-06   10:43
 */
public class RecoveryModel {
    public static void main(String[] args) {
        int i = 5;
        while (true) {
            try {
                RecoveryModel r = null;
                if (i == 1) {
                    r = new RecoveryModel();
                    break;
                }
                i--;
                r.getClass();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("结束了吗");
            }
        }
        System.out.println("end");
    }
}
