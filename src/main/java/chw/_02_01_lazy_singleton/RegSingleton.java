package chw._02_01_lazy_singleton;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * 登记式单例
 */
public class RegSingleton {

    private static Map<String, RegSingleton> m_registry = new HashMap<>();

    static {
        RegSingleton x = new RegSingleton();
        m_registry.put(x.getClass().getName(), x);
    }

    protected RegSingleton() {

    }

    public static RegSingleton getInstance(String name) {
        RegSingleton x = null;
        if (name == null) {
            name = "RegSingleton";
        }
        if ((x = m_registry.get(name)) == null) {
            try {
                m_registry.put(name, (RegSingleton) Class.forName(name).getConstructor().newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return x;
    }
}
