package chapterSix;

import chapterSix.jf.Cookie;

/**
 * @author 江峰
 * @create 2018-12-18 13:52
 */
public class Cake extends Cookie {
    public Cake() {
        System.out.println("constructer cake");
    }

    void taste() {
        System.out.println("taste");
        super.fun();
    }

    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.taste();
    }
}
