package design.pattern.creation.singleton;

import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingleton1() {
        Singleton1 singleton = Singleton1.getInstance();
        assert singleton != null;
    }

    @Test
    public void testSingleton2() {
        Singleton2 singleton2 = Singleton2.getInstance();
        assert singleton2 != null;
    }

    @Test
    public void testSingleton3() {
        Singleton3 singleton3 = Singleton3.getInstance();
        assert singleton3 != null;
    }

    @Test
    public void testSingleton4() {
        Singleton4 singleton4 = Singleton4.INSTANCE;
        assert singleton4.getName() == null;
    }
}
