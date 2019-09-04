package gof.chainofresponsibility;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 21:28
 * mailbox:343928303@qq.com
 **/
public abstract class Leader {

    protected Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }
    // 审批
    public abstract void approve();

}
