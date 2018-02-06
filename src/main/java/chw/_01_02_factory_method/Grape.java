package chw._01_02_factory_method;

public class Grape implements Fruit {
    private boolean seedless;//是否有籽
    private String name= "葡萄";

    @Override
    public void plant() {
        System.out.println("Grape has been plant.");
    }

    @Override
    public void grow() {
        System.out.println("Grape is growing...");
    }

    @Override
    public void harvest() {
        System.out.println("Grape has been harvested.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * @return 是否有籽
     */
    public boolean getSeedless() {
        return seedless;
    }

    /**
     * 设置是否有籽
     *
     * @param seedless 是否有籽
     */
    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
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
