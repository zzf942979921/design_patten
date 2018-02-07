package chw._01_03_abstract_factory;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:13 2018/2/7
 * @Modified:
 */
public class IntelMainBoard implements MainBoard {
    private int cpuHoles = 0;//cpu插槽的孔数

    public IntelMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public void installCPU() {
        System.out.println("Intel 主板的CPU插槽孔数是: " + this.cpuHoles);
    }
}
