package chapter.ten;

/**
 * @author 江峰
 * @create 2018-12-25 14:42
 */
interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {
    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable {

        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    public Closure getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable incrementable;

    public Caller(Incrementable incrementable) {
        this.incrementable = incrementable;
    }

    public void go() {
        incrementable.increment();
    }
}

public class Callbacks {
    public static void main(String[] args) {
        Callee1 callee1 = new Callee1();
        Callee2 callee2 = new Callee2();
        MyIncrement.f(callee2);
        System.out.println("-------------------------");
        Caller caller1 = new Caller(callee1);
        caller1.go();
        caller1.go();
        System.out.println("-------------------------");

        Caller caller2 = new Caller(callee2.getCallbackReference());
        caller2.go();
        caller2.go();
    }
}
