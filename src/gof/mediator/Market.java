package gof.mediator;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 21:33
 * mailbox:343928303@qq.com
 **/
public class Market {

    private Queue<String> goods = new LinkedList<>();
    // 通过市场卖出东西
    public void sell(String good) {
        goods.add(good);
    }

    // 通过市场买到东西
    public String buy() {
        return goods.poll();
    }

}
