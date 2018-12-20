package chapter.eight;

import java.util.Random;

/**
 * @author 江峰
 * @create 2018-12-20 11:03
 */
public class RandShapeGenerator {
    private Random rand = new Random();

    public Shape next() {
        switch (rand.nextInt(2)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Triangle();
        }
    }
}
