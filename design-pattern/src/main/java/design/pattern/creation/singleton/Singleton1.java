package design.pattern.creation.singleton;

/**
 * 饿汉式-线程安全
 * 不能做到延迟实例化，浪费资源
 */
public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
