package gof.abstratfactory;

/**
 * Created by
 * author:valarchie
 * on 2019/8/27 20:45
 * mailbox:343928303@qq.com
 **/
public class KentuckyFactory implements AbstractFactory {
    @Override
    public Burger getBurger() {
        return new KentuckyBurger();
    }

    @Override
    public Cola getCola() {
        return new PepsiCola();
    }
}
