package chw.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 15:43 2018/2/9
 * @Modified:
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (String key : list) {
            System.out.println(key);
        }

    }
}
