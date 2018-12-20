package chapter.five;

/**
 * @author 江峰
 * @create 2018-12-13 16:20
 */
public class Practice1 {
    // str被默认初始化成了null
    String str;

    Practice1() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        new Practice1();
    }
}
