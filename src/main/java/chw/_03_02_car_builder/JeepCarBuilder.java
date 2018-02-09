package chw._03_02_car_builder;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:58 2018/2/9
 * @Modified:
 */
public class JeepCarBuilder extends CarBuilder {
    Car car = new Car();

    public void makeHead() {
        car.setHead("Jeep head");
    }

    public void makeBody() {
        car.setBody("Jeep body");
    }

    public void makeTail() {
        car.setTail("Jeep tail");
    }

    public Car getResult() {
        return car;
    }
}
