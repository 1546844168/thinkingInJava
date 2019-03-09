package interview;

/**
 * @author 潇潇暮雨
 * @create 2019-03-08   20:46
 */
public class AccessWithInnerClassExample {
    private class InnerClass {
        int x = 3;
    }

    private InnerClass innerClass;

    public AccessWithInnerClassExample() {
        innerClass = new InnerClass();
    }

    public int getValue() {
        return innerClass.x;
    }
}
