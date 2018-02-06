package chw._01_02_factory_method;

public class TestApp {
    private FruitGardener f1, f2, f3;
    private Fruit p1, p2, p3;
    private void test(){
        f1 = new AppleGardener();
        f2 = new GrapeGardener();
        f3 = new StrawberryGardener();
        p1 = f1.factory();
        p2 = f2.factory();
        p3 = f3.factory();
    }

    public static void main(String[] args) {
        TestApp ta = new TestApp();
        ta.test();
    }
}
