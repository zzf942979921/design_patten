package chw._01_03_abstract_factory;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:34 2018/2/7
 * @Modified:
 */
public class Client {
    public static void main(String[] args) {
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(new IntelFactory());
    }
}
