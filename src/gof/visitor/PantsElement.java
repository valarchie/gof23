package gof.visitor;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 23:56
 * mailbox:343928303@qq.com
 **/
public class PantsElement implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visite(this);
    }

}
