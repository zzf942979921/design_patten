package chw._03_03_3dimensional_model;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 15:49 2018/2/9
 * @Modified:
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰跑起来了");
    }

    @Override
    protected void stop() {

        System.out.println("奔驰停下了");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰的喇叭声");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰的引擎声");
    }
}
