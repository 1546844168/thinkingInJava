package chapter.fourteen;

/**
 * @author 潇潇暮雨
 * @create 2019-03-20   15:33
 */
public class WildcardClassReference {
    public static void main(String[] args) {
        Class<?> integerClass = int.class;
        integerClass = double.class;
        System.out.println(integerClass.getName());
    }
}
