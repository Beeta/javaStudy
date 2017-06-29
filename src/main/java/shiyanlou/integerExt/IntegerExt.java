package shiyanlou.integerExt;

import java.util.*;

/**
 * Created with Project: javastudy
 * User: Casey
 * Date: 2017/6/28　17:17
 * Description: 实验楼题目
 * https://www.shiyanlou.com/contests/lou10/challenges
 * 答案来源: http://www.jianshu.com/p/dc01dc837cf0
 */
public class IntegerExt {
    private int i;
    private static Map<String, IntegerExt> list = new HashMap<>(256);

    private IntegerExt(int i){
        this.i = i;
    }

    public int toIntValue(){
        return i;
    }

    public static IntegerExt getInstance(int i){
        String str = String.valueOf(i);
        if (list.containsKey(str)) {
            return list.get(str);
        }
        IntegerExt result = new IntegerExt(i);
        if (i >= -128 && i <= 127) {
            list.put(str, result);
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IntegerExt) {
            return this.i == ((IntegerExt)obj).toIntValue();
        }
        return super.equals(obj);
    }
}