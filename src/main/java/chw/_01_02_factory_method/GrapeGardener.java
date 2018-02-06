package chw._01_02_factory_method;

public class GrapeGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return init(new Grape());
    }
}
