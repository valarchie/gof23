package gof.decorator;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 22:24
 * mailbox:343928303@qq.com
 **/
public class IceSwardDecorator extends SwardDecorator {

    public IceSwardDecorator(Sward sward) {
        super(sward);
    }

    @Override
    public void chop() {
        sward.chop();
        System.out.print("附带冰属性！");
    }

}
