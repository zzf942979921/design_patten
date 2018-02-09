package chw._03_03_3dimensional_model;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 15:51 2018/2/9
 * @Modified:
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马跑起来了");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停下了");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马的喇叭声");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马的引擎声");
    }
}
