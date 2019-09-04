package gof.singleton;

/**
 * Created by
 * author:valarchie
 * on 2019/9/4 20:55
 * mailbox:343928303@qq.com
 **/
public class TestSingleton {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

    }


}
