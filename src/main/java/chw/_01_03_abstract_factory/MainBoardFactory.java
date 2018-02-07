package chw._01_03_abstract_factory;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:19 2018/2/7
 * @Modified:
 */
public class MainBoardFactory {
    public static MainBoard createMainBoard(int type) {
        MainBoard mb = null;
        if (type == 1) {
            mb = new IntelMainBoard(755);
        } else if (type == 2) {
            mb = new AmdMainBoard(938);
        }
        return mb;
    }
}
