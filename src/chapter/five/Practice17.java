package chapter.five;

/**
 * @author 江峰
 * @create 2018-12-17 20:37
 */
public class Practice17 {
    Practice17(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Practice17[] arr = new Practice17[3];
        arr[0] = new Practice17("tom");
        System.out.println("exit");
    }
}
