package chw._01_03_abstract_factory;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 9:41 2018/2/7
 * @Modified:
 */
public class AdmCpu implements Cpu {
    private int pins = 0;//cpu针脚数

    public AdmCpu(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("AMD CPU 的针脚数：" + this.pins);
    }
}
