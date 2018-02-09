package chw._03_02_car_builder;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 10:57 2018/2/9
 * @Modified:
 */
public abstract class CarBuilder {
    public abstract void makeHead();

    public abstract void makeBody();

    public abstract void makeTail();

    public abstract Car getResult();
}
