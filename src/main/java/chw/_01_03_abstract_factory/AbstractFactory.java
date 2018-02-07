package chw._01_03_abstract_factory;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:44 2018/2/7
 * @Modified:
 */
public interface AbstractFactory {

    Cpu createCpu();

    MainBoard createMainBoard();
}
