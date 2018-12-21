package chapter.nine.test;

/**
 * @author 江峰
 * @create 2018-12-21 23:12
 */
public class ManFactory implements HumanFactory {
    @Override
    public Human getMan() {
        return new Man();
    }
}
