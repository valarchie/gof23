package gof.mediator;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 21:32
 * mailbox:343928303@qq.com
 **/
public class Seller {

    public void sellToMarket(Market market) {
        market.sell("商品A");
        System.out.println("向市场卖出一个商品A！");
    }

}
