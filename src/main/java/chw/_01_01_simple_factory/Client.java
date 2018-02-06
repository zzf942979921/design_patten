package chw._01_01_simple_factory;

public class Client {
    public static void main(String[] args) {
        //通过简单工厂来获取接口对象
        Api api = Factory.createApi(1);
        api.operation("正在使用简单工厂");
    }
}
