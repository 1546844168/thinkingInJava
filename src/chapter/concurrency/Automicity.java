package chapter.concurrency;

/**
 * @author 潇潇暮雨
 * @create 2019-04-07   9:56
 */
public class Automicity {
    int i = 0;

    void fun() {
        i++;
    }

    void fun2() {
        i += 2;
    }
}
