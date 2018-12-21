package chapter.nine.interfaceprocessor;

import chapter.nine.filters.HighPass;
import chapter.nine.filters.LowPass;
import chapter.nine.filters.Waveform;

/**
 * @author 江峰
 * @create 2018-12-21 14:35
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Apply.processor(new FilterAdapter(new LowPass(1.00)), new Waveform());
        Apply.processor(new FilterAdapter(new HighPass(1.00)), new Waveform());
    }
}
