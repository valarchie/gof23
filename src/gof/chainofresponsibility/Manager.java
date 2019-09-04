package gof.chainofresponsibility;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 21:35
 * mailbox:343928303@qq.com
 **/
public class Manager extends Leader {

    @Override
    public void approve() {
        System.out.println("经理审批通过！");
        if (getNext() != null) {
            getNext().approve();
        }
    }

}
