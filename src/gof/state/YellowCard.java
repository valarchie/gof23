package gof.state;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 19:52
 * mailbox:343928303@qq.com
 **/
public class YellowCard extends Card {
    @Override
    public void attack() {
        System.out.println("黄牌攻击力：30！");
    }

    @Override
    public void consumeMana() {
        System.out.println("黄牌消耗魔法值：20！");
    }

    @Override
    public void effect() {
        System.out.println("黄牌造成敌人眩晕！");
    }
}
