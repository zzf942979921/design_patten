package chw._01_02_factory_method;

public class Apple implements Fruit {
    private int treeAge;
    private String name= "苹果";
    @Override
    public void plant() {
        System.out.println("Apple has been plant.");
    }

    @Override
    public void grow() {
        System.out.println("Apple is growing...");
    }

    @Override
    public void harvest() {
        System.out.println("Apple has been harvested.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * @return 返回树龄
     */
    public int getTreeAge() {
        return treeAge;
    }

    /**
     * 设置树龄
     * @param treeAge 树龄
     */
    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
