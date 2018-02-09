package chw._03_01_builder;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:34 2018/2/9
 * @Modified:
 */
public class Director1 {
    private Builder builder;

    public Director1(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

}
