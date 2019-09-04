package gof.state;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 19:52
 * mailbox:343928303@qq.com
 **/
public abstract class Card {

    // 攻击力
    public abstract void attack();
    // 消耗蓝量
    public abstract void consumeMana();
    // 特殊效果
    public abstract void effect();


}
