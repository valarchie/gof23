package gof.chainofresponsibility;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 21:34
 * mailbox:343928303@qq.com
 **/
public class GroupLeader extends Leader {
    @Override
    public void approve() {

        System.out.println("组长审批通过！");

        if (getNext() != null) {
            getNext().approve();
        }

    }
}
