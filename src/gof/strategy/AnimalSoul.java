package gof.strategy;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 21:28
 * mailbox:343928303@qq.com
 **/
public class AnimalSoul {

    // 当前的形态
    private Strategy animal;
    // 使用形态进行攻击
    public void animalAttack() {
        animal.attack();
    }

    public Strategy getStrategy() {
        return animal;
    }

    public void setStrategy(Strategy strategy) {
        this.animal = strategy;
    }
}
