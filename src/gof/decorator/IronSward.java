package gof.decorator;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 22:21
 * mailbox:343928303@qq.com
 **/
public class IronSward implements Sward {

    @Override
    public void chop() {
        System.out.println("钢刀劈砍！");
    }

}
