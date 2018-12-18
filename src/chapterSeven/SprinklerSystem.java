package chapterSeven;

/**
 * @author 江峰
 * @create 2018-12-18 20:45
 */
public class SprinklerSystem {
    private String value1, value2;
    private int i;
    private float f;
    private WaterSource waterSource = new WaterSource(); // 定义对象的地方进行初始化

    {
        i = 100; // 实例初始化
    }

    SprinklerSystem(String value1) {
        this.value1 = value1; // 构造器里面进行初始化
    }

    @Override
    public String toString() {
        if (f == 0)
            f = 100f; // 延迟初始化
        return "SprinklerSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", i=" + i +
                ", f=" + f +
                ", waterSource=" + waterSource +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem("name");
        System.out.println(sprinklerSystem.toString());
    }
}
