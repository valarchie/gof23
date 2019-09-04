package gof.proxy;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 20:14
 * mailbox:343928303@qq.com
 **/
public class TestProxy {

    public static void main(String[] args) {

        ProxySeller proxy = new ProxySeller(new StationSeller());

        proxy.sellTicket();

    }

}
