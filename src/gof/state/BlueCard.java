package gof.state;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 20:03
 * mailbox:343928303@qq.com
 **/
public class BlueCard extends Card {
    @Override
    public void attack() {
        System.out.println("蓝牌攻击力：10！");
    }

    @Override
    public void consumeMana() {
        System.out.println("蓝牌消耗魔法值：10！");
    }

    @Override
    public void effect() {
        System.out.println("蓝牌回复魔法值50！");
    }
}
