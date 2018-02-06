package chw._01_02_factory_method;

/**
 * 水果工厂接口
 */
public interface FruitGardener {
    /**
     * 工厂方法
     * @return 水果
     */
    Fruit factory();

    default Fruit init(Fruit f){
        System.out.println("水果工厂(" + this.getClass().getSimpleName() + ") 成功创建一个水果: " + f.getName() + "！");
        return f;
    }
}
