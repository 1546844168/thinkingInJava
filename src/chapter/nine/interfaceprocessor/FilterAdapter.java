package chapter.nine.interfaceprocessor;

import chapter.nine.filters.Filter;
import chapter.nine.filters.Waveform;

/**
 * @author 江峰
 * @create 2018-12-21 14:29
 */
class FilterAdapter implements Processor {
    private Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object processor(Object input) {
        return filter.processor((Waveform) input);
    }
}
