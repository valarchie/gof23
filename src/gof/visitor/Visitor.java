package gof.visitor;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 23:51
 * mailbox:343928303@qq.com
 **/
public interface Visitor {

    void visite(ShirtElement element);

    void visite(PantsElement element);

}
