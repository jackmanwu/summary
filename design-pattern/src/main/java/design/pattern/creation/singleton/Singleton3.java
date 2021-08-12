package design.pattern.creation.singleton;

/**
 * 静态内部类
 * Singleton3被加载时，静态内部类SingletonHolder未被加载，
 * 仅当SingletonHolder.INSTANCE被调用时才会被加载
 * 由JVM确保INSTANCE只被实例化一次
 */
public class Singleton3 {
    private Singleton3() {

    }

    private static class SingletonHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
