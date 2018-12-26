package chapter.ten;

/**
 * @author 江峰
 * @create 2018-12-24 16:39
 */
public class Parcel9 {

    public Destination destination(String dest) {
        return new Destination() {
            private String label = dest;

            @Override
            public String readLable() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Destination destination = new Parcel9().destination("jiang feng");
        System.out.println(destination.readLable());
    }
}
