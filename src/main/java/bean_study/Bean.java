package bean_study;

/**
 * Created with Project: javastudy
 * User: CUN
 * Date: 2017/7/6　22:52
 * Description: 用来测试Bean的使用方法, 尤其是在类成员变量里
 */

public class Bean {
    private int i;
    private String b;
    private People people;

   public static class People{
        String name;
        int age;

       @Override
       public String toString() {
           return name + "," + age;
       }
   }

    public Bean(int i,String b){
        this.i = i;
        this.b = b;
//        this.people = people;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getI() {
        return i;
    }

    public String getB() {
        return b;
    }

    public void setPeople(People people){
        this.people = people;
    }
    @Override
    public String toString(){
        return "这个类里有: i:" + i + ",b:" +b+","+ people.toString()  ;
    }
}
