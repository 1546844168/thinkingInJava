package chapter.seven;

/**
 * @author 江峰
 * @create 2018-12-18 20:40
 */
public class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("水源");
        s = "constructeed";
    }

    @Override
    public String toString() {
        return "WaterSource{" +
                "s='" + s + '\'' +
                '}';
    }
}
