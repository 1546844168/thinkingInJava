package chapter.nine.filters;

/**
 * @author 江峰
 * @create 2018-12-21 13:43
 */
public abstract class Filter {

    public String name() {
        return this.getClass().getSimpleName();
    }

    public abstract Object processor(Object input);
//    {
//        return input;
//    }
}
