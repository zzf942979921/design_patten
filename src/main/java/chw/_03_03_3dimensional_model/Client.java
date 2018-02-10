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
//        BMWModel bmw = new BMWModel();
//        List<CarDoType> sequence = new ArrayList<>();
//        sequence.add(CarDoType.engine_boom);
//        sequence.add(CarDoType.start);
//        sequence.add(CarDoType.stop);
//        bmw.setSequence(sequence);
//        bmw.run();

//        List<CarDoType> sequence = new ArrayList<>();
//        sequence.add(CarDoType.engine_boom);
//        sequence.add(CarDoType.start);
//        sequence.add(CarDoType.stop);
//        BenzBuilder benzBuilder = new BenzBuilder();
//        benzBuilder.setSequence(sequence);
//        BenzModel benz = ((BenzModel) benzBuilder.getCarModel());
//        benz.run();
//
//        BMWBuilder bmwBuilder = new BMWBuilder();
//        bmwBuilder.setSequence(sequence);
//        BMWModel bmw = ((BMWModel) bmwBuilder.getCarModel());
//        bmw.run();

        Director director = new Director();
        for (int i = 0; i < 1; i++) {
            director.getABenzModel().run();
        }
        System.out.println("=======");
        for (int i = 0; i < 10; i++) {
            director.getBBenzModel().run();
            System.out.println("+++++++++++");
        }
        System.out.println("=======");
        for (int i = 0; i < 10; i++) {
            director.getCBenzModel().run();
            System.out.println("+++++++++++");
        }
    }
}
