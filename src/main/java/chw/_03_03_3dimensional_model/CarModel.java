package chw._03_03_3dimensional_model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 15:35 2018/2/9
 * @Modified:
 */
public abstract class CarModel {
    private List<CarDoType> sequence = new ArrayList<>();//此参数是各个方法执行的顺序

    /**
     * 启动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 喇叭声音
     */
    protected abstract void alarm();

    /**
     * 引擎声音
     */
    protected abstract void engineBoom();

    final public void run() {
        for (CarDoType item : this.sequence) {
            if (item.equals(CarDoType.start)) {
                this.start();
            } else if (item.equals(CarDoType.stop)) {
                this.stop();
            } else if (item.equals(CarDoType.alarm)) {
                this.alarm();
            } else if (item.equals(CarDoType.engine_boom)) {
                this.engineBoom();
            }
        }
    }

    final public void setSequence(List<CarDoType> sequence) {
        this.sequence = sequence;
    }


}
