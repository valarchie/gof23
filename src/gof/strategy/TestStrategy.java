package gof.strategy;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 21:34
 * mailbox:343928303@qq.com
 **/
public class TestStrategy {

    public static void main(String[] args) {

        AnimalSoul animalSoul = new AnimalSoul();
        // 切换老虎形态
        animalSoul.setStrategy(new Tiger());
        animalSoul.animalAttack();
        // 切换乌龟形态
        animalSoul.setStrategy(new Tortoise());
        animalSoul.animalAttack();
        // 切换狼人形态
        animalSoul.setStrategy(new Wolf());
        animalSoul.animalAttack();


    }

}
