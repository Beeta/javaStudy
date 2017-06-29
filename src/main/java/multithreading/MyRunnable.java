package multithreading;

/**
 * Created by Casey on 2017/5/8 17:38.
 */
public class MyRunnable implements Runnable{
    public MyRunnable(){}

    public void run() {
        System.out.println("子线程ID："+Thread.currentThread().getId());
    }
}
