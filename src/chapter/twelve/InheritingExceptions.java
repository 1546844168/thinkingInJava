package chapter.twelve;

/**
 * @author 潇潇暮雨
 * @create 2019-03-05   21:31
 */

class SimpleException extends Exception {

}

public class InheritingExceptions {
    public static void main(String[] args) {
        try {
            fun();
        } catch (SimpleException e) {
            System.out.println(" catch exception");
        }
        System.out.println("helloworld");
    }

    public static void fun() throws SimpleException {
        System.out.println("throw Exception from fun（）");
        throw new SimpleException();
    }
}
