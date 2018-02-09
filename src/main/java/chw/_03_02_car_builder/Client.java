package chw._03_02_car_builder;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 11:25 2018/2/9
 * @Modified:
 */
public class Client {

    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder builder = new JeepCarBuilder();
        director.makeCar(builder);
        Car c = builder.getResult();
        System.out.println(c.getHead());
        System.out.println(c.getBody());
        System.out.println(c.getTail());
    }
}
