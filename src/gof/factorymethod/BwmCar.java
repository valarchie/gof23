package gof.factorymethod;

/**
 * Created by
 * author:valarchie
 * on 2019/8/27 21:42
 * mailbox:343928303@qq.com
 **/
public class BwmCar implements Car {
    @Override
    public void start() {
        System.out.println("启动宝马车！");
    }
}
