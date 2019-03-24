package chapter.fourteen;

/**
 * @author 潇潇暮雨
 * @create 2019-03-24   17:48
 */
public class NullObject {
    public static void main(String[] args) {
        try {
            new NullObject().g();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void g() throws Exception {
        fun();
    }

    public void fun() throws Exception {
        throw new Exception();
    }
}
