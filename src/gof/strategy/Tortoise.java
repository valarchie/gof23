package gof.strategy;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 21:26
 * mailbox:343928303@qq.com
 **/
public class Tortoise implements Strategy{
    @Override
    public void attack() {
        System.out.println("使用乌龟形态进行攻击！");
    }
}
