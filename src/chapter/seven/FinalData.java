package chapter.seven;

/**
 * @author 江峰
 * @create 2018-12-19 15:07
 */
class Value {
    String name;

    public Value(String name) {
        this.name = name;
        System.out.println(name);
    }

    @java.lang.Override
    public String toString() {
        return "Value{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class FinalData {
    final int j;
    private final int i = 100;
    public static final int NUM = 100;
    private final Value value = new Value("潇潇暮雨");

    public FinalData(int j) {
        this.j = j;
    }

    public void increase() {
//        i++;
    }

    public void change() {
        value.name = "江峰";
    }

    @java.lang.Override
    public String toString() {
        return "FinalData{" +
                "i=" + i +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        FinalData finalData = new FinalData(111);
        finalData.change();
        System.out.println(finalData);
        System.out.println(FinalData.NUM);
    }
}
