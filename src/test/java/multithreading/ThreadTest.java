package multithreading;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by Casey on 2017/5/8 17:20.
 */
public class ThreadTest extends TestCase {


    public void testThread(){
        MyThread thread = new MyThread();
        thread.start();
    }

    public void testRunnable(){
        System.out.println("主线程ID："+Thread.currentThread().getId());
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }


}
