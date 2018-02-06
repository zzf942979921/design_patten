package chw._01_02_factory_method;

/**
 * 水果接口
 */
public interface Fruit {
    /**
     * 种植
     */
    void plant();

    /**
     * 生长
     */
    void grow();

    /**
     * 收获
     */
    void harvest();

    String getName();
}
