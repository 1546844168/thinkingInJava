package chapter.fourteen;

import java.lang.reflect.Field;

/**
 * @author 潇潇暮雨
 * @create 2019-03-24   20:53
 */

class WithPrivateFinalFields {
    private int i = 1;
    private final String s = "I am final String";
    private String s2 = "I am not final String";

    @Override
    public String toString() {
        return "WithPrivateFinalFields{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
}

public class ModifyingPrivateFields {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        WithPrivateFinalFields wpf = new WithPrivateFinalFields();
        Field i = wpf.getClass().getDeclaredField("i");
        i.setAccessible(true);
        System.out.println(i.getInt(wpf));
        i.setInt(wpf, 47);
        System.out.println(wpf);
        System.out.println("---------------");
        i = wpf.getClass().getDeclaredField("s");
        i.setAccessible(true);
        System.out.println(i.get(wpf));
        i.set(wpf, "hhh");
        System.out.println(i.get(wpf));
        System.out.println(wpf);
        System.out.println("---------------");
        i = wpf.getClass().getDeclaredField("s2");
        i.setAccessible(true);
        System.out.println(i.get(wpf));
        i.set(wpf, "s2s2s2");
        System.out.println(wpf);


    }
}
