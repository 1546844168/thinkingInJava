package chapter.thirteen;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @author 潇潇暮雨
 * @create 2019-03-19   19:08
 */
public class Ex8 {
    public static void showAllInheritanceClass(Class c) {
        Class a = null;
        while ((a = c.getSuperclass()) != null) {
            Field[] declaredFields = a.getDeclaredFields();
            for (Field field : declaredFields) {
                System.out.println(field);
            }
            System.out.println(a.getName());
            c = a;
        }
    }

    public static void main(String[] args) {
        showAllInheritanceClass(new ArrayList<>().getClass());
    }
}
