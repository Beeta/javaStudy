package Java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created with Project: javastudy
 * User: Casey
 * Date: 2017/7/11　11:52
 * Description: 参考: http://www.liaoxuefeng.com/article/001411309538536a1455df20d284b81a7bfa2f91db0f223000
 */
public class StreamAPI {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public void demo() {

        Stream<Integer> stream = numbers.stream();
        stream.filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .forEach(System.out::println); // 等价于 .forEach(x -> System.out.println(x));

        /*
        * 上面使用的是lambda表达式, 等价于
        stream.filter((x) -> {
            return x % 2 == 0;
        }).map((x) -> {
            return x * x;
        }).forEach(System.out::println);
        * */
    }


    public void limitDemo() {
        // 跳过两个数, 取三个数(3.4.5), 转为list
        List<Integer> collect = numbers.stream().skip(2).limit(3).collect(Collectors.toList());
        System.out.println(collect);
    }


    public static void main(String[] args) {
        StreamAPI streamAPI = new StreamAPI();
//        streamAPI.demo();

        streamAPI.limitDemo();
    }
}
