package chw._01_02_factory_method;

public class StrawberryGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return init(new Strawberry());
    }
}
