package chw._02_03_simple_base_singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ${user}
 * @Description:
 * @Date: Created in 11:09 2018/2/8
 * @Modified:
 */
public class OneExtend {
    private static final String DEFAULT_PREKEY = "Cache";
    private static Map<String, OneExtend> map = new HashMap<>();
    private static int num = 1;
    private static final int NUM_MAX = 3;

    public static OneExtend getInstance() {
        String key = DEFAULT_PREKEY + num;
        OneExtend oneExtend = map.get(key);
        if (oneExtend == null) {
            oneExtend = new OneExtend();
            map.put(key, oneExtend);
        }
        num++;
        if (num > NUM_MAX) {
            num = 1;
        }
        return oneExtend;
    }

    public static void main(String[] args) {
        OneExtend t1 = getInstance();
        OneExtend t2 = getInstance();
        OneExtend t3 = getInstance();
        OneExtend t4 = getInstance();
        OneExtend t5 = getInstance();
        OneExtend t6 = getInstance();
        System.out.println("t1==" + t1);
        System.out.println("t2==" + t2);
        System.out.println("t3==" + t3);
        System.out.println("t4==" + t4);
        System.out.println("t5==" + t5);
        System.out.println("t6==" + t6);
    }
}
