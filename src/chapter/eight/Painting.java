package chapter.eight;

/**
 * @author 江峰
 * @create 2018-12-20 10:44
 */
class Shape {

    public void draw() {
        System.out.println("shape draw");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("triangle draw");
    }
}


public class Painting {
    private Shape[] shapes = new Shape[4];
    private RandShapeGenerator randShapeGenerator = new RandShapeGenerator();

    public void init() {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = randShapeGenerator.next();
        }
    }

    public void printShapes() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
       Painting painting = new Painting();
       painting.init();
       painting.printShapes();
    }
}
