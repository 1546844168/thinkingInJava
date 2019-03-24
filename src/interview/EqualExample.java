package interview;


/**
 * @author 潇潇暮雨
 * @create 2019-03-08   21:07
 */

class Fu {
    private int i = 35;
    protected String name = "tom";

    public Fu() {
        System.out.println("初始化Fu类");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != getClass()) return false;
        Fu that = (Fu) o;
        return i == that.i && name == that.name;

    }

}

public class EqualExample extends Fu {
    private int x;
    private int y;

    public EqualExample(int x, int y) {
        super();
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
        Fu fu = new Fu();
        Object o = new EqualExample(1, 2);
        boolean equals = fu.equals(e);
        System.out.println(equals);
        System.out.println(e.hashCode());

    }

}
