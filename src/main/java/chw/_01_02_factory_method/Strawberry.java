package chw._01_02_factory_method;

public class Strawberry implements Fruit {

    private String name= "草莓";

    @Override
    public void plant() {
        System.out.println("Strawberry has been plant.");
    }

    @Override
    public void grow() {
        System.out.println("Strawberry is growing...");
    }

    @Override
    public void harvest() {
        System.out.println("Strawberry has been harvested.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * 辅助方法
     *
     * @param msg
     */
    public static void log(String msg) {
        System.out.println(msg);
    }
}
