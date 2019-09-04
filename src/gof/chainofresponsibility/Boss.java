package gof.chainofresponsibility;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 21:37
 * mailbox:343928303@qq.com
 **/
public class Boss extends Leader {
    @Override
    public void approve() {
        System.out.println("老板审批通过！");
        if (getNext() != null) {
            getNext().approve();
        }
    }
}
