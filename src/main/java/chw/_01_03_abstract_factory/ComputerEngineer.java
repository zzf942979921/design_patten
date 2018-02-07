package chw._01_03_abstract_factory;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:29 2018/2/7
 * @Modified:
 */
public class ComputerEngineer {
//    private Cpu cpu = null;
//    private MainBoard mb = null;
//    public void makeComputer(int cpuType, int mainBord){
//        prepareHardware(cpuType, mainBord);
//    }
//
//    private void prepareHardware(int cpuType, int mainBord){
//        this.cpu = CpuFactory.createCpu(cpuType);
//        this.mb = MainBoardFactory.createMainBoard(mainBord);
//        this.cpu.calculate();
//        this.mb.installCPU();
//    }

    private Cpu cpu = null;
    private MainBoard mb = null;

    public void makeComputer(AbstractFactory af){
        prepareHardware(af);
    }

    private void prepareHardware(AbstractFactory af){
        this.cpu = af.createCpu();
        this.mb = af.createMainBoard();
        this.cpu.calculate();
        this.mb.installCPU();
    }
}
