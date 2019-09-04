package gof.memento;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 22:45
 * mailbox:343928303@qq.com
 **/
public class Memento {
    // 状态
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
