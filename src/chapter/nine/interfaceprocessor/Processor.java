package chapter.nine.interfaceprocessor;

/**
 * @author 江峰
 * @create 2018-12-21 13:58
 */
public interface Processor {
    String name();

    Object processor(Object input);
}
