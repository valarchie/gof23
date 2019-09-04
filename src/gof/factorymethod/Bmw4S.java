package gof.factorymethod;

/**
 * Created by
 * author:valarchie
 * on 2019/8/27 21:41
 * mailbox:343928303@qq.com
 **/
public class Bmw4S implements Abstract4S{
    @Override
    public Car getCar() {
        return new BwmCar();
    }
}
