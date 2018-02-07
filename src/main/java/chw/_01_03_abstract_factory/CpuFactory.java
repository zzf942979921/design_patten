package chw._01_03_abstract_factory;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:17 2018/2/7
 * @Modified:
 */
public class CpuFactory {

    public static Cpu createCpu(int type) {
        Cpu cpu = null;
        if (type == 1) {
            cpu = new IntelCpu(755);
        } else if (type == 2) {
            cpu = new AdmCpu(938);
        }
        return cpu;
    }
}
