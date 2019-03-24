package chapter.thirteen;

/**
 * @author 潇潇暮雨
 * @create 2019-03-19   22:50
 */
public class Ex10 {
    public static void main(String[] args) {
        char[] c = {'a', 'b', 'c'};
        System.out.println("Superclass of char[] c: " +
                c.getClass().getSuperclass());
        System.out.println("char[] c instanceof Object: " +
                (c instanceof Object));
    }
}
