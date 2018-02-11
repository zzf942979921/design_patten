package chw._03_05_builder_deep;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 11:22 2018/2/11
 * @Modified:
 */
public class Client {
    public static void main(String[] args) {
        Builder minGong = new MinGong();
        Designer designer = new Designer();
        designer.order(minGong);
        Room r = minGong.getRoom();
        System.out.println(r.getWindow());
    }
}
