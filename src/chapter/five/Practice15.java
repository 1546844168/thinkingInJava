package chapter.five;

/**
 * @author 江峰
 * @create 2018-12-17 16:32
 */
public class Practice15 {
    String name;

    {
        name = "江峰";
    }

    Practice15() {
        System.out.println("初始化 " + name);
    }

    public static void main(String[] args) {
        new Practice15();
    }

}
