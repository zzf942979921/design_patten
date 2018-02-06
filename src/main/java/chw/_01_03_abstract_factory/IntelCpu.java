package chw._01_03_abstract_factory;

public class IntelCpu implements Cpu {

    private int pins = 0;//针脚数

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("Intel CPU 的针脚数：" + this.pins);
    }
}
