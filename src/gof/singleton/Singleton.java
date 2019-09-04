package gof.singleton;

/**
 * Created by
 * author:valarchie
 * on 2019/9/4 20:55
 * mailbox:343928303@qq.com
 **/
public class Singleton {

    private volatile static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();

                    System.out.println("新建对象！");
                }
            }
        }
        return instance;
    }

}
