package reg_singleton;

import java.util.HashMap;

/**
 * Created with Project: javastudy
 * User: Casey
 * Date: 2017/6/22　12:16
 * Description:
 */
public class A {
    String name;
    private static HashMap<String, A> map = new HashMap<>();

    private A(String name) {
        this.name = name;
    }

    public static A getIns(String name) {
        if (map.get(name) == null) {
            System.out.println("-->name对应的值不存在，开始创建");
            map.put(name, new A(name));
        } else
            System.out.println("-->name存在, 直接返回对应的实例");
        return map.get(name);
    }
}
