package gof.state;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 20:02
 * mailbox:343928303@qq.com
 **/
public class RedCard extends Card {
    @Override
    public void attack() {
        System.out.println("红牌攻击力：20！");
    }

    @Override
    public void consumeMana() {
        System.out.println("红牌消耗魔法值：30！");
    }

    @Override
    public void effect() {
        System.out.println("红牌造成范围伤害！");
    }
}
