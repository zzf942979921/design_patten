package chw._02_02_double_lock;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:32 2018/2/8
 * @Modified:
 */
public class DoubleLockSingleton {
    private volatile static DoubleLockSingleton instance = null;

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }
}
