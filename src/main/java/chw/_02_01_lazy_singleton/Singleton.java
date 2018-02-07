package chw._02_01_lazy_singleton;

/**
 * @Author: ${user}
 * @Description: 懒汉单例模式的实例
 * @Date: Created in 16:06 2018/2/7
 * @Modified:
 */
public class Singleton {
//    private static Singleton uniqueInstance = null; // 存储创建好的实例
//    private String singletonData;
//
//    private Singleton() {
//    }
//
//    public static synchronized Singleton getInstance() {
//        if (uniqueInstance == null) {
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }
//
//    /**
//     * 单例的操作
//     */
//    public void singletonOperation() {
//
//    }
//
//    public String getSingletonData() {
//        return singletonData;
//    }

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    /**
     * 单例的操作
     */
    public void singletonOperation() {

    }

    private String singletonData;

    public String getSingletonData() {
        return singletonData;
    }
}
