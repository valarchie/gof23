package gof.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 23:58
 * mailbox:343928303@qq.com
 **/
public class WareHouse {

    private List<Element> clothes = new ArrayList();

    public void add(Element element) {
        clothes.add(element);
    }

    public void accept(Visitor visitor) {

        for (Element clothe : clothes) {
            clothe.accept(visitor);
        }
        
    }

}
