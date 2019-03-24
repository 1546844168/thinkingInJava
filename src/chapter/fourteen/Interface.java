package chapter.fourteen;

/**
 * @author 潇潇暮雨
 * @create 2019-03-20   19:51
 */
interface Interface {
    void doSomething();
}

class ReadObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("readobject dosomething()");
    }
}

class SimpleProxy implements Interface {
    private Interface anInterface;

    public SimpleProxy(Interface anInterface) {
        this.anInterface = anInterface;
    }

    @Override
    public void doSomething() {
        System.out.println("simpleProxy dosomething()");
        anInterface.doSomething();
    }
}

class SimpleProxyDemo {
    static void consumer(Interface i) {
        i.doSomething();
    }

    public static void main(String[] args) {
        consumer(new ReadObject());
        System.out.println("-----------------");
        consumer(new SimpleProxy(new ReadObject()));
    }
}
