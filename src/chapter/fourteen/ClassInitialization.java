package chapter.fourteen;

/**
 * @author 潇潇暮雨
 * @create 2019-03-19   23:21
 */
public class ClassInitialization {
    static final String name = "tom";   //编译期常量，不会引起类的初始化。

    static {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        System.out.println(ClassInitialization.name);
    }
}


