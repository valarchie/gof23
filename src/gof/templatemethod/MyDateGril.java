package gof.templatemethod;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 22:04
 * mailbox:343928303@qq.com
 **/
public class MyDateGril extends DateGirl {
    @Override
    public void shopping() {
        System.out.println("去中山街逛街！");
    }

    @Override
    public void eating() {
        System.out.println("去吃王品！");
    }

    @Override
    public void seeMovie() {
        System.out.println("去看《速度与激情》！");
    }
}
