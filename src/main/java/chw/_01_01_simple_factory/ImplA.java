package chw._01_01_simple_factory;

/**
 * 接口具体实现的对象A
 */
public class ImplA implements Api {
    @Override
    public void operation(String s) {
        //实现功能的具体代码
        System.out.println("ImplA s == " + s);
    }
}
