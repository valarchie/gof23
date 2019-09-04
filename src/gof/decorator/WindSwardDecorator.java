package gof.decorator;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 22:24
 * mailbox:343928303@qq.com
 **/
public class WindSwardDecorator extends SwardDecorator {

    public WindSwardDecorator(Sward sward) {
        super(sward);
    }

    @Override
    public void chop() {
        sward.chop();
        System.out.print("附带风属性！");
    }

}
