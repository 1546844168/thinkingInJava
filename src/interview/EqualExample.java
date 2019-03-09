package interview;


import java.util.HashMap;

/**
 * @author 潇潇暮雨
 * @create 2019-03-08   21:07
 */
public class EqualExample {
    private int x;
    private int y;

    public EqualExample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != getClass()) return false;
        EqualExample that = (EqualExample) o;
        return x == that.x && y == that.y;

    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        EqualExample e = new EqualExample(1, 2);
        Object o = new EqualExample(1, 2);
        System.out.println(e.hashCode());
    }

}
