package chw._02_01_lazy_singleton;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 17:25 2018/2/7
 * @Modified:
 */
public class EagerSingleton {
    private static final EagerSingleton m_instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return m_instance;
    }
}
