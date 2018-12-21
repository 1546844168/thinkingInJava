package chapter.nine.filters;

/**
 * @author 江峰
 * @create 2018-12-21 13:55
 */
public class HighPass extends Filter {
    private double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform processor(Object input) {
        return (Waveform) input;
    }
}
