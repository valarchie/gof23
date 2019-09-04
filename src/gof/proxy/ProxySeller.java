package gof.proxy;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 20:09
 * mailbox:343928303@qq.com
 **/
public class ProxySeller implements TicketSeller {
    // 动车站售票机
    private TicketSeller stationSeller;

    public ProxySeller(TicketSeller stationSeller) {
        this.stationSeller = stationSeller;
    }

    @Override
    public void sellTicket() {

        connectingStationSeller();
        stationSeller.sellTicket();
        payTheTicket();

    }

    // 代售点出票前 需要先连接火车站售票系统
    private void connectingStationSeller() {
        System.out.println("连接火车站售票点，请求出票！");
    }

    // 出票后 需要将票款扣除手续费的钱支付给火车站
    private void payTheTicket() {
        System.out.println("将火车票钱扣除手续费剩下的钱支付给火车站！");
    }

}
