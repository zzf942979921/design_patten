package chw._03_04_builder_race;

public class Main {
    public static void main(String[] args) {
        Race race = new RaceBuilder().builder().setName("张三").setSex("男").setSkinColor("黄色").create();
        System.out.println(race);
    }
}
