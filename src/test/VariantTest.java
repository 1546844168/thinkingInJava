package test;

/**
 * @author 潇潇暮雨
 * @create 2019-02-25   14:32
 */
public class VariantTest {
    public static int staticVar = 0;
    public int instanceVar = 0;

    public void test() {
        staticVar++;
        instanceVar++;
        System.out.println(staticVar + "  " + instanceVar);
    }

    public static void main(String[] args) {
        new VariantTest().test();
        new VariantTest().test();
        new VariantTest().test();
        new VariantTest().test();
    }
}
