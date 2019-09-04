package gof.memento;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 22:45
 * mailbox:343928303@qq.com
 **/
public class Originator {

    private String state;
    // 创建一个备忘录
    public Memento createMemento() {
        return new Memento(state);
    }
    // 从一个备忘录中恢复状态
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
