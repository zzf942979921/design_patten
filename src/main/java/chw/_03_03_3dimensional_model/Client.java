package chw._03_03_3dimensional_model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 15:52 2018/2/9
 * @Modified:
 */
public class Client {
    public static void main(String[] args) {
//        BenzModel benz = new BenzModel();
        BMWModel bmw = new BMWModel();
        List<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        bmw.setSequence(sequence);
        bmw.run();
    }
}
