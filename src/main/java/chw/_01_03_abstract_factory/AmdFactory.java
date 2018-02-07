package chw._01_03_abstract_factory;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:46 2018/2/7
 * @Modified:
 */
public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new AdmCpu(938);
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard(938);
    }
}
