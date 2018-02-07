package chw._01_03_abstract_factory;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:15 2018/2/7
 * @Modified:
 */
public class AmdMainBoard implements MainBoard {

    private int cpuHoles = 0; //CPU插槽的孔数

    public AmdMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public void installCPU() {
        System.out.println("AMD主板的CPU插槽的孔数是：" + this.cpuHoles);
    }
}
