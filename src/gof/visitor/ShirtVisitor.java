package gof.visitor;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 23:57
 * mailbox:343928303@qq.com
 **/
public class ShirtVisitor implements Visitor {

    @Override
    public void visite(ShirtElement element) {
        System.out.println("盘点衣服！");
    }

    @Override
    public void visite(PantsElement element) {
        System.out.println("这是裤子，不盘点！");
    }
}
