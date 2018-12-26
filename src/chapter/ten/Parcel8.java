package chapter.ten;

/**
 * @author 江峰
 * @create 2018-12-24 16:32
 */
public class Parcel8 {

    public Wrapping wrapping(int i) {
        return new Wrapping(i) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel8 = new Parcel8();
        Wrapping wrapping = parcel8.wrapping(2);
        System.out.println(wrapping.value());
    }
}
