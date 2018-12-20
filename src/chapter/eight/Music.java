package chapter.eight;

/**
 * @author 江峰
 * @create 2018-12-20 10:08
 */
class Cycle {
    public void ride() {
        System.out.println("cycle ride");
    }
}

class Bycicle extends Cycle {
    public void ride() {
        System.out.println("Bycicle  ride");
    }
}

class Unicycle extends Cycle {
    public void ride() {
        System.out.println("Unicycle  ride");
    }
}

public class Music {
    public static void play(Cycle cycle) {
        cycle.ride();
    }

    public static void main(String[] args) {
        play(new Cycle());
        play(new Bycicle());
        play(new Unicycle());
    }
}


