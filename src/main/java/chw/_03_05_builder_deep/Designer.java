package chw._03_05_builder_deep;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 11:14 2018/2/11
 * @Modified:
 */
public class Designer {
    public Designer() {
    }

    public void order(Builder builder) {
        builder.makeFloor();
        builder.makeWindow();
    }
}
