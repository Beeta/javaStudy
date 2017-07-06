package bean_study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with Project: javastudy
 * User: CUN
 * Date: 2017/7/6　22:55
 * Description:
 */

public class Main {
    private HashMap<String, Bean> map = new HashMap<>();

    private List<AA> list;

    public static class AA {
        int ll;
    }

    public Main() {


    }

    public static void main(String[] args) {
        Main main = new Main();

        main.process();

    }

    public void process(){
        Bean hah = new Bean(1, "hah");
        Bean.People people = new Bean.People();
        people.age = 2;
        people.name = "zhao";
        hah.setPeople(people);
        map.put("a", hah);
//        map.put("fdsf", new Bean(2,"33"));
//        map.get("a").setB("qqqqqqqqqqq");
        System.out.println(map);



        list = new ArrayList<>();
        AA aa = new AA();
        aa.ll=6;
        list.add(aa);
        list.add(aa);
        System.out.println("=============");
        System.out.println(list.get(0).ll);

    }
}
