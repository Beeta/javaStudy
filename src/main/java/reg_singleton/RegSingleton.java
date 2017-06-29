package reg_singleton;

/**
 * Created with Project: javastudy
 * User: Casey
 * Date: 2017/6/22　12:12
 * Description: 登记式单例模式
 */
public class RegSingleton {
    public static void main(String[] args) {
        A hao = A.getIns("hao");
        A hao1 = A.getIns("hao1");
        A hao2 = A.getIns("hao");
        System.out.println(hao == hao1);
        System.out.println(hao == hao2);
    }
}
