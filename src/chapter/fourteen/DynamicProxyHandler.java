package chapter.fourteen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 潇潇暮雨
 * @create 2019-03-20   20:08
 */
class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass() + ", method:" + method + ", args:" + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.println(" " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}

class SimpleDynamicProxy {
    public static void cunsumer(Interface iface) {
        iface.doSomething();
    }

    public static void main(String[] args) {
        ReadObject readObject = new ReadObject();
        cunsumer(readObject);
        Interface o = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(readObject));
        cunsumer(o);
    }
}
