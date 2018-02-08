package chw._03_01_builder;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 15:36 2018/2/8
 * @Modified:
 */
//public abstract class Builder {
//    protected Product product = new Product();
//
//    public abstract void buildPartA();
//
//    public abstract void buildPartB();
//
//    public abstract void buildPartC();
//
//    public Product getResult() {
//        return product;
//    }
//}

public interface Builder {
    void buildPartA();

    void buildPartB();

    void buildPartC();

    Product getResult();
}
