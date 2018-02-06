package chw._01_02_factory_method;

/**
 * 苹果工厂方法
 */
public class AppleGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return init(new Apple());
    }

}
