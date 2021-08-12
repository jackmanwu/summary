package design.pattern.creation.singleton;

/**
 * 双重校验锁-线程安全
 * 延迟实例化-节约资源
 */
public class Singleton2 {
    private volatile static Singleton2 instance;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
