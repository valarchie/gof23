package gof.mediator;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 21:33
 * mailbox:343928303@qq.com
 **/
public class Buyer {

    public void buyFromMarket(Market market) {
        System.out.println("从市场买入" + market.buy() + "!");
    }

}
