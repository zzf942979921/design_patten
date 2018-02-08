package chw._03_01_builder;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 17:24 2018/2/8
 * @Modified:
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
