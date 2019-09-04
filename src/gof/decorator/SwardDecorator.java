package gof.decorator;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 22:22
 * mailbox:343928303@qq.com
 **/
public abstract class SwardDecorator implements Sward {

    protected Sward sward;

    public SwardDecorator(Sward sward) {
        this.sward = sward;
    }

}
