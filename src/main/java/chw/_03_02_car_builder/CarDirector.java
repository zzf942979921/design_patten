package chw._03_02_car_builder;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 11:18 2018/2/9
 * @Modified:
 */
public class CarDirector {
    public void makeCar(CarBuilder builder) {
        builder.makeHead();
        builder.makeBody();
        builder.makeTail();
    }
}
