package gof.proxy;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 20:08
 * mailbox:343928303@qq.com
 **/
public class StationSeller implements TicketSeller {

    @Override
    public void sellTicket() {
        System.out.println("卖出一张票！");
    }

}
