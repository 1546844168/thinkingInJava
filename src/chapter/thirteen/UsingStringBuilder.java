package chapter.thirteen;

import java.util.Random;

/**
 * @author 潇潇暮雨
 * @create 2019-03-19   15:43
 */
public class UsingStringBuilder {
    public Random rand = new Random(47);

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            sb.append(rand.nextInt(100));
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usingStringBuilder = new UsingStringBuilder();
        String s = usingStringBuilder.toString();
        System.out.println(s);
    }
}
