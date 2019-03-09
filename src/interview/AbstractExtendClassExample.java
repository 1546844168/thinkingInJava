package interview;

/**
 * @author 潇潇暮雨
 * @create 2019-03-08   20:56
 */
public class AbstractExtendClassExample extends AbstractClassExample {
    @Override
    public void func1() {
        System.out.println("func1");
    }
    public static void main(String[] args){
//         AbstractClassExample ac1 = new AbstractClassExample(); // 'AbstractClassExample' is abstract; cannot be instantiated
        AbstractClassExample ac2 = new AbstractExtendClassExample();
        ac2.func1();
        ac2.func2();
    }
}