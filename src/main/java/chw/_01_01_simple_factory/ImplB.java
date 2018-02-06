package chw._01_01_simple_factory;

/**
 * 接口的具体时间对象B
 */
public class ImplB implements Api {
    @Override
    public void operation(String s) {
        System.out.println("ImplB s == " + s);
    }
}
