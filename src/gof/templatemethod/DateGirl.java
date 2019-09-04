package gof.templatemethod;

/**
 * Created by
 * author:valarchie
 * on 2019/9/2 22:01
 * mailbox:343928303@qq.com
 **/
public abstract class DateGirl {

    // 逛街
    public abstract void shopping();
    // 吃饭
    public abstract void eating();
    // 看电影
    public abstract void seeMovie();

    // 规定了与女孩约会的流程
    public void howToDateGirl() {
        shopping();
        eating();
        seeMovie();
    }


}
