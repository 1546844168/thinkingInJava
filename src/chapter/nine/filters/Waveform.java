package chapter.nine.filters;

/**
 * @author 江峰
 * @create 2018-12-21 13:39
 */
public class Waveform {
    private static long count = 0;
    private final long id = count++;

    @Override
    public String toString() {
        return "Waveform{" +
                "id=" + id +
                '}';
    }
}
