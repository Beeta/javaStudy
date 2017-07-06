package cache;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with Project: javastudy
 * User: CUN
 * Date: 2017/7/6　23:37
 * Description:
 */

public class CacheDemo {
    private Map<Integer, A> map;

    public static class A {
        long time;
        String count;
    }

    public CacheDemo() {
        map = new HashMap<>();
    }

    public String query(int num) {

        if(map.get(num)!=null && System.currentTimeMillis()-map.get(num).time<=10*1000) {
            System.out.println("返回缓存");
//            map.get(num).time = System.currentTimeMillis();
            return map.get(num).count;
        }


        int count = num;
        for (int i = 1; i < num; i++)
            count += i;

        A a = new A();
        a.time = System.currentTimeMillis();
        a.count = count+"";
        map.put(num,a);
        System.out.println("需要计算");
        return count + "";

    }

    public static void main(String[] args) throws InterruptedException {
        CacheDemo cacheDemo = new CacheDemo();
        while(true) {
            String query = cacheDemo.query(3);
            Thread.sleep(1000);
        }
//        System.out.println(query);
    }

}
