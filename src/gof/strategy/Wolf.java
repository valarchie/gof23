package gof.strategy;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 21:27
 * mailbox:343928303@qq.com
 **/
public class Wolf implements Strategy {
    @Override
    public void attack() {
        System.out.println("使用狼人形态进行攻击！");
    }
}
