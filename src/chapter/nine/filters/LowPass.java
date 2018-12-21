package chapter.nine.filters;

/**
 * @author 江峰
 * @create 2018-12-21 13:52
 */
public class LowPass extends Filter {
    private double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform processor(Object input) {
        return (Waveform) input;
    }
}
