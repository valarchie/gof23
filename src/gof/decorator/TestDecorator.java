package gof.decorator;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 22:26
 * mailbox:343928303@qq.com
 **/
public class TestDecorator {

    public static void main(String[] args) {

        Sward ironSward = new IronSward();

        // 进行火焰附魔
        Sward fire = new FireSwardDecorator(ironSward);
        // 进行冰霜附魔
        Sward ice = new IceSwardDecorator(fire);
        // 进行飓风附魔
        Sward wind = new WindSwardDecorator(ice);

        wind.chop();

    }

}
