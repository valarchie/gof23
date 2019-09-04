package gof.mediator;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 21:38
 * mailbox:343928303@qq.com
 **/
public class TestMediator {


    public static void main(String[] args) {
        // 市场类
        Market market = new Market();
        // 卖家
        Seller seller = new Seller();
        // 卖出两个商品
        seller.sellToMarket(market);
        seller.sellToMarket(market);
        // 买家
        Buyer buyer = new Buyer();
        // 从市场买入两个商品
        buyer.buyFromMarket(market);
        buyer.buyFromMarket(market);

    }


}
