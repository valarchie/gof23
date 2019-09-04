package gof.abstratfactory;

/**
 * Created by
 * author:valarchie
 * on 2019/8/27 20:46
 * mailbox:343928303@qq.com
 **/
public class McDonaldFactory implements AbstractFactory{
    @Override
    public Burger getBurger() {
        return new McDonaldBurger();
    }

    @Override
    public Cola getCola() {
        return new CokeCola();
    }
}
