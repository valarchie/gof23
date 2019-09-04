package gof.strategy;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 21:26
 * mailbox:343928303@qq.com
 **/
public class Tiger implements Strategy {
    @Override
    public void attack() {
        System.out.println("使用老虎形态进行攻击！");
    }
}
