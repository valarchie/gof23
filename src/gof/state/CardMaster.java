package gof.state;

import java.util.Random;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 19:52
 * mailbox:343928303@qq.com
 **/
public class CardMaster {

    private Card[] cards = {new YellowCard(), new RedCard(), new BlueCard()};

    private Card currentCard = cards[0];

    // 发动卡牌技能
    public void flushCard() {

        System.out.println("+++发动卡牌技能！+++");

        currentCard.attack();
        currentCard.consumeMana();
        currentCard.effect();

        swichCard();

    }

    // 每次发完牌之后，卡牌颜色会随机变换
    public void swichCard() {

        Random random = new Random();
        int index = random.nextInt(3);
        currentCard = cards[index];

    }



}
