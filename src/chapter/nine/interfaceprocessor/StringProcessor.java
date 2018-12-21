package chapter.nine.interfaceprocessor;


import java.util.Arrays;

/**
 * @author 江峰
 * @create 2018-12-21 14:05
 */
public abstract class StringProcessor implements Processor {
    public static String str = "My name is jiangfeng";

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    public abstract Object processor(Object input);

    public static void main(String[] args) {
        Apply.processor(new Upcase(), str);
        Apply.processor(new Splitter(), str);
    }
}

class Upcase extends StringProcessor {

    public String processor(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Splitter extends StringProcessor {
    public String processor(Object input) {
        String[] s = ((String) input).split(" ");
        return Arrays.toString(s);
    }
}
