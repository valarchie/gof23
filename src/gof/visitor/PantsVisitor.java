package gof.visitor;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 23:58
 * mailbox:343928303@qq.com
 **/
public class PantsVisitor implements Visitor {

    @Override
    public void visite(ShirtElement element) {
        System.out.println("这是衣服，不盘点！");
    }

    @Override
    public void visite(PantsElement element) {
        System.out.println("盘点裤子！");
    }
}
