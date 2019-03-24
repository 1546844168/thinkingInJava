package chapter.fourteen;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 潇潇暮雨
 * @create 2019-03-24   20:08
 */
public class HiddenImplementation {
    public static void main(String[] args) {
        A c = HiddenC.makeA();
        c.f();
        System.out.println(c.getClass().getName());
        if (c instanceof C) {
        }
        callHiddenMethod(c, "f");
        callHiddenMethod(c, "g");
        callHiddenMethod(c, "h");
        callHiddenMethod(c, "i");
    }

    static void callHiddenMethod(Object o, String methodName) {
        try {
            Method method = o.getClass().getDeclaredMethod(methodName);
            method.setAccessible(true);
            method.invoke(o);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
