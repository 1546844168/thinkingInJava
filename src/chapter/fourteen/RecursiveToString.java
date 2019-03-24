package chapter.fourteen;

/**
 * @author 潇潇暮雨
 * @create 2019-03-24   17:32
 */
public class RecursiveToString {
    @Override
    public String toString() {
        return this.toString();
    }

    public static void main(String[] args) {
        new RecursiveToString().toString();
//        System.out.println(new HashMap<>().hashCode());
//        System.out.println(new HashMap<>().hashCode());

    }
}
