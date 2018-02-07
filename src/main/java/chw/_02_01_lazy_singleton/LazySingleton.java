package chw._02_01_lazy_singleton;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 16:45 2018/2/7
 * @Modified:
 */
public class LazySingleton {
    private static LazySingleton m_install = null;

    private LazySingleton() {
    }

    synchronized public static LazySingleton getM_install() {
        if (m_install == null) {
            m_install = new LazySingleton();
        }
        return m_install;
    }
}
