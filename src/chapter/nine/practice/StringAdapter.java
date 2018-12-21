package chapter.nine.practice;

import chapter.nine.interfaceprocessor.Apply;
import chapter.nine.interfaceprocessor.Processor;

/**
 * @author 江峰
 * @create 2018-12-21 15:42
 */
public class StringAdapter implements Processor {
    private OperationString operationString;

    public StringAdapter(OperationString operationString) {
        this.operationString = operationString;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public Object processor(Object input) {
        return operationString.inverseString((String) input);
    }

    public static void main(String[] args) {
        Apply.processor(new StringAdapter(new OperationString()), "abcd");
    }
}
