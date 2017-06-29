package shiyanlou.ioc;

/**
 * Created with Project: javastudy
 * User: Casey
 * Date: 2017/6/28　17:50
 * Description:
 */
public class ShiyanlouImpl implements Shiyanlou{

    @Override
    public String toUp(String name){
        try {
            return name.toUpperCase();
        } catch (Exception e) {
            return null;
        }
    }
}